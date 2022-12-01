package StepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageObjects.SearchPage;

public class SearchPageStepDef {
    @Then("^I will be on the (\\w+) page$")
    public void iWillBeOnThePage(String pageHeader) {
        Assert.assertEquals(pageHeader, SearchPage.headerTitle());
    }
}
