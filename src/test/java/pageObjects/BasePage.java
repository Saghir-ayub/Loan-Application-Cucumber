package pageObjects;

import Manager.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class BasePage {
    protected static WebDriver driver = DriverFactory.getDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    protected static Actions action = new Actions(driver);

    static void FindAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.clear();
        element.sendKeys(inputString);
    }

    static void WaitAndClick(By elementSelector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.click();
    }

    static WebElement VisibilityOfElement(By elementSelector) {
        WebElement element = driver.findElement(elementSelector);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    static String TitleOfHeader() {
        return VisibilityOfElement(By.xpath("//h1")).getText();
    }
}
