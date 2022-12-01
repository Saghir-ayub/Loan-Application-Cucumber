package pageObjects;

import org.openqa.selenium.By;

import java.util.Collection;

public class LoanApplicationPage extends BasePage{

    private static final By SUBMIT_APPLICATION = By.xpath("//button[@type='submit']");
    private static final By HEADER_OF_PAGE = By.xpath("//h1");

    public static void inputApplicationDetails(String currentId, String currentInformation) {
        By currentInputField = By.id(currentId);
        FindAndType(currentInputField,currentInformation);
    }

    public static void submitApplication() {
        WaitAndClick(SUBMIT_APPLICATION);
    }

    public static String accessDenied() {
        return VisibilityOfElement(HEADER_OF_PAGE).getText();
    }
}
