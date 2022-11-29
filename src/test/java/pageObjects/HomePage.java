package pageObjects;

public class HomePage extends BasePage{
    public static final String URL = "http://35.178.110.62:8080/";

    public static void goToHomePage(){driver.get(URL);}
}
