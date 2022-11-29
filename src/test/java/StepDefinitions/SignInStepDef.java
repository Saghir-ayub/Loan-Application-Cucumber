package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.SignInPage;

public class SignInStepDef {
    @Given("enter username: {string} and password: {string}")
    public void enterUsernameAndPassword(String userName, String passWord) {
        SignInPage.fillInLoginInformation(userName,passWord);
    }

    @And("click sign in")
    public void clickSignIn() {
        SignInPage.signIn();
    }
}
