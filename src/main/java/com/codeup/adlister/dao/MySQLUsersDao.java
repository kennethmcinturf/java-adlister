package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(ConfigThis config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        User user = new User();
        String searchTermWithWildcards = "%" + username + "%";
        try {
            PreparedStatement stmt = connection.prepareStatement(getFindUsernameQuery(), Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,searchTermWithWildcards);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                user.setId(rs.getLong(1));
                user.setUsername(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
            }
            return user;
        }catch (SQLException e){
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(getInsertQuery(), Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1,user.getUsername());
            stmt.setString(2,user.getEmail());
            stmt.setString(3,user.getPassword());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        }catch (SQLException e){
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    private String getFindUsernameQuery(){
        return "SELECT * FROM users WHERE username LIKE ?";
    }

    private String getInsertQuery(){
        return "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    }

    public static void main(String[] args) {
        MySQLUsersDao mDao = new MySQLUsersDao(new ConfigThis());

        String username = "Steve";
        User findUsername = mDao.findByUsername(username);
        System.out.println(findUsername.getUsername());
        System.out.println(findUsername.getEmail());
    }
}
