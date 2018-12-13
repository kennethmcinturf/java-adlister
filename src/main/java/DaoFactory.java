import javax.servlet.jsp.jstl.core.Config;
import java.util.List;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new ConfigThis());
        }
        return adsDao;
    }

}
