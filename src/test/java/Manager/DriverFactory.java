package Manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
    }

    private static void setDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito");
        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver(){
        if(driver==null){
            setDriver();
        }
        return driver;
    }

    public static void tearDownDriver() {
        getDriver();
        driver.close();
    }
}
