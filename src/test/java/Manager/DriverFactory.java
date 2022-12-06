package Manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    private static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized", "incognito", "headless");
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
        System.out.println("Driver closed :"+ driver);
        driver.close();
    }
}
