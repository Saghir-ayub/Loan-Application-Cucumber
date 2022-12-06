package Manager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotTaker {
    private static int i = 0;
    public static void addScreenShotsOnFailure() {
        i = i + 1;
        File scrFile = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E dd MMM HH:mm:ss z yyyy");
        String strDate = formatter.format(d);
        String screenshotName = strDate.replace(":", "_").replace(" ", "_") + "_" + i + ".jpg";

        try {
            FileUtils.copyFile(scrFile, new File("C:\\Users\\saghir.ayub\\Documents\\Automation training\\LoanApplication\\target\\extent-report\\" + screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
