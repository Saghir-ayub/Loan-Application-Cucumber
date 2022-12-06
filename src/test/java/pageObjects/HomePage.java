package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
    protected static final Logger logger = LogManager.getLogger(HomePage.class);
    public static final String URL = "http://13.40.4.230:8080/";
    private static final By LOGIN_BUTTON = By.xpath("//a[contains(@href,'logout')]");
    private static final By LOGGED_IN_AS = By.xpath("//a[contains(@href,'logout')]/parent::span");
    private static final By LOGOUT_CONFIRMATION = By.xpath("//form[contains(@action,'login')]//div[contains(@class,'alert-info')]");

    public static void goToHomePage(){
        driver.get(URL);
        logger.info("You have arrived on the homepage");
    }

    public static void clickLoginButton() {
        WaitAndClick(LOGIN_BUTTON);
    }

    public static void clickCreateANewApplication(String pageChoice) {
        By pageToNavigateTo = By.xpath("//a[contains(@href,'"+pageChoice+"')]");
        WaitAndClick(pageToNavigateTo);
    }

    public static String loggedInAs() {
        return VisibilityOfElement(LOGGED_IN_AS).getText();
    }

    public static String logoutConfirmationMessage() {
        return VisibilityOfElement(LOGOUT_CONFIRMATION).getText();
    }
    public static String HeaderTitle() {
        return TitleOfHeader();
    }
}
