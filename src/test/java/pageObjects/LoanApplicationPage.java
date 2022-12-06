package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LoanApplicationPage extends BasePage{
    protected static final Logger logger = LogManager.getLogger(LoanApplicationPage.class);
    private static final By SUBMIT_APPLICATION = By.xpath("//button[@type='submit']");
    private static final By HEADER_OF_PAGE = By.xpath("//h1");

    public static void inputApplicationDetails(String currentId, String currentInformation) {
        By currentInputField = By.id(currentId);
        FindAndType(currentInputField,currentInformation);
    }

    public static void submitApplication() {
        WaitAndClick(SUBMIT_APPLICATION);
        logger.info("Application submitted");
    }

    public static String headerTitle() {
        return TitleOfHeader();
    }
}
