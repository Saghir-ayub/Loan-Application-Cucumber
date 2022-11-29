package pageObjects;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public static final String URL = "http://35.178.110.62:8080/";
    private static final By LOGIN_BUTTON = By.xpath("//a[contains(@href,'logout')]");
    private static final By LOAN_APPLICATION = By.xpath("//a[contains(@href,'application')]");

    public static void goToHomePage(){driver.get(URL);}

    public static void clickLoginButton() {
        WaitAndClick(LOGIN_BUTTON);
    }

    public static void clickCreateANewApplication() {
        WaitAndClick(LOAN_APPLICATION);
    }
}
