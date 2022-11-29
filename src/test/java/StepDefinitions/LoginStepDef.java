package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class LoginStepDef {
    @Given("I am on the homepage")
    public void iAmOnTheHomePage(){
        HomePage.goToHomePage();
    }

    @And("I click log in button")
    public void iClickLogInButton() {
        HomePage.clickLoginButton();
    }

    @And("click create a new application")
    public void clickCreateANewApplication() {
        HomePage.clickCreateANewApplication();
    }
}
