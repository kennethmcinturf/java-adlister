package com.codeup.adlister.dao;

class ConfigThis {

    private String Url = "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    private String Username = "adlister";
    private String Password = "Kc@120892";

    public String getUrl() {
        return Url;
    }
    public String getUsername() {
        return Username;
    }
    public String getPassword() {
        return Password;
    }
}
