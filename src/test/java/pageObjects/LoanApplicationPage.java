package pageObjects;

import org.openqa.selenium.By;

public class LoanApplicationPage extends BasePage{

    private static final By SUBMIT_APPLICATION = By.xpath("//button[@type='submit']");

    public static void inputApplicationDetails(String currentId, String currentInformation) {
        By currentInputField = By.id(currentId);
        FindAndType(currentInputField,currentInformation);
    }

    public static void submitApplication() {
        WaitAndClick(SUBMIT_APPLICATION);
    }
}
