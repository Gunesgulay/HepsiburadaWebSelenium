package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Page {

    WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public void waitUntilTheElementAppears(String elementId){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }

    public void pressKey(String keyId){
        driver.findElement(By.id(keyId)).click();
    }

    public void writeInTheField(String elementId, String emailAddress){
        driver.findElement(By.id(elementId)).sendKeys(emailAddress);
    }
}
