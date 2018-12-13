import java.sql.*;

import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    Connection connection;

    public MySQLAdsDao(ConfigThis config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
                    );
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Ad> all(){
        List<Ad> result = new ArrayList<>();
        String query = "Select * FROM ads";
        Ad thisResult = null;
        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                do {
                    thisResult = new Ad(
                            resultSet.getLong("user_id"),
                            resultSet.getString("title"),
                            resultSet.getString("description")
                    );
                    result.add(thisResult);
                }while (resultSet.next());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Long insert(Ad ad) {
        Long result = null;
        String adTitle = ad.getTitle();
        String adDescription = ad.getDescription();
        Long adUserId = ad.getUserId();
        String adUserIdString = Long.toString(adUserId);
        String query = "INSERT INTO ads(user_id, title, description) VALUES (" + "'" + adUserIdString + "'," +
                "'" + adTitle + "'," +  "'" + adDescription + "'" + ")";
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result =  rs.getLong(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
