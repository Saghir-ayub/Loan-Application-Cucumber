package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class SignInStepDef {
    @Given("I am on the homepage")
    public void iAmOnTheHomePage(){
        HomePage.goToHomePage();
    }

    @And("^I click the log in / out button on the homepage")
    public void iClickLogInButton() {
        HomePage.clickLoginButton();
    }

    @And("^navigate to (\\w+) page$")
    public void navigateToPage(String pageChoice) {
        HomePage.clickCreateANewApplication(pageChoice.toLowerCase());
    }
    @Given("I enter username: {string} and password: {string}")
    public void enterUsernameAndPassword(String userName, String passWord) {
        SignInPage.fillInLoginInformation(userName,passWord);
    }

    @And("click sign in")
    public void clickSignIn() {
        SignInPage.signIn();
    }

    @Then("I see logged in as {string}")
    public void iSeeLoggedInAs(String loggedUser) {
        System.out.println(HomePage.loggedInAs());
        Assert.assertTrue(String.format("was expecting Logged user: %s but was: %s",loggedUser,HomePage.loggedInAs()),HomePage.loggedInAs().contains("Logged user: "+loggedUser));
    }

    @Then("I see I have been logged out")
    public void iSeeIHaveBeenLoggedOut() {
        Assert.assertEquals("You have been logged out.",HomePage.logoutConfirmationMessage());
    }

    @Then("I will be redirected to sign in page")
    public void iWillBeRedirectedToSignInPage() {
        Assert.assertEquals("Please Sign In",SignInPage.HeaderTitle());
    }

    @And("I am not logged in")
    public void iAmNotLoggedIn() {
        if(!HomePage.loggedInAs().contains("Logged user:  ")){
            HomePage.clickLoginButton();
            HomePage.goToHomePage();
        }
    }
}
