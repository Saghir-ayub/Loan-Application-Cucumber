package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class SignInPage extends BasePage{
    protected static final Logger logger = LogManager.getLogger(SignInPage.class);
    private static final By USERNAME = By.id("username");
    private static final By PASSWORD = By.id("password");
    private static final By SIGN_IN = By.xpath("//input[@type='submit']");
    public static void fillInLoginInformation(String userName, String passWord){
        FindAndType(USERNAME,userName);
        FindAndType(PASSWORD,passWord);
    }

    public static void signIn() {
        WaitAndClick(SIGN_IN);
    }

    public static String HeaderTitle() {
        return TitleOfHeader();
    }
}
