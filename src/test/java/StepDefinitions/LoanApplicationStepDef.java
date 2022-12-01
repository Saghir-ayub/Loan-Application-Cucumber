package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.text.CaseUtils;
import org.junit.Assert;
import pageObjects.LoanApplicationPage;

import java.util.Map;

public class LoanApplicationStepDef {
    @Given("I input the application details")
    public void iInputTheApplicationDetails(DataTable data){
        Map<String, String> userInformation = data.asMap(String.class, String.class);

        for (Map.Entry<String, String> entry : userInformation.entrySet()) {
            String currentId;
            String currentInformation = userInformation.get(entry.getKey());

            if ((entry.getKey()).equals("Loan Amount")) {
                currentId = "amount";
            } else {
                currentId = CaseUtils.toCamelCase(entry.getKey(), false);
            }

            LoanApplicationPage.inputApplicationDetails(currentId, currentInformation);
        }
    }

    @And("click the submit button")
    public void clickTheSubmitButton() {
        LoanApplicationPage.submitApplication();
    }

    @Then("I will see {string}")
    public void iWillSee(String accessDenied) {
        Assert.assertTrue("was expecting access is denied but instead got: "+LoanApplicationPage.accessDenied(),
                LoanApplicationPage.accessDenied().contains(accessDenied));
    }
}
