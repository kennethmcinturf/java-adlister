import javax.servlet.jsp.jstl.core.Config;
import java.util.List;

public class DaoFactory {
    private static Ads adsDao;
<<<<<<< Updated upstream:src/main/java/DaoFactory.java
=======
    private static ConfigThis config = new ConfigThis();
>>>>>>> Stashed changes:src/main/java/com/codeup/adlister/dao/DaoFactory.java

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new ConfigThis());
        }
        return adsDao;
    }

}
