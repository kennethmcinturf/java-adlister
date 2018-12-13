package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static ConfigThis config = new ConfigThis();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
