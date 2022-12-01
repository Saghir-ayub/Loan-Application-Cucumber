package pageObjects;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{
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
