package Manager;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ScreenShotTaker {
    private static int scrShotCount = 0;
    public static void addScreenShotsOnFailure(Scenario scenario) {
        ++scrShotCount;
        TakesScreenshot screenshot = (TakesScreenshot) DriverFactory.getDriver();
        File scrFile = screenshot.getScreenshotAs(OutputType.FILE);

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E dd MMM HH:mm:ss z yyyy");
        String strDate = formatter.format(d);
        String screenshotName = strDate.replace(":", "_").replace(" ", "_") + "_" + scrShotCount + ".jpg";

        try {
            FileUtils.copyFile(scrFile, new File("C:\\Users\\saghir.ayub\\Documents\\Automation training\\LoanApplication\\target\\extent-report\\" + screenshotName));
            scenario.attach(screenshot.getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
