package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchPage extends BasePage{
    protected static final Logger logger = LogManager.getLogger(SearchPage.class);
    public static String headerTitle(){
        return TitleOfHeader();
    }
}
