package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;
    @BeforeMethod
    public void beforemethod(){
        driver.switchTo().defaultContent();
    }
    @BeforeTest
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("Url Loaded");
    }
    @Test(priority = 0)
    public void simpleAlertTestCase(){
        driver.findElement(By.xpath("//button[contains(text() , 'Simple Alert')]")).click();
        Reporter.log("Simple alert opened");
        Alert simple = driver.switchTo().alert();
        Reporter.log("Simple Alert text is : " + simple.getText());
        Assert.assertEquals("This is a JavaScript Alert!" , simple.getText());
        simple.accept();
        Reporter.log("Simple alert closed");
    }
    @Test(priority = 1)
    public void confirmAlertTestCase(){
        driver.findElement(By.xpath("//button[contains(text() , 'Confirmation')]")).click();
        Reporter.log("Confirmation alert opened");
        Alert confirmation = driver.switchTo().alert();
        Reporter.log("Confirmation text is : " + confirmation.getText());
        Assert.assertEquals("This is a JavaScript Confirmation!" , confirmation.getText());
        confirmation.accept();
        Reporter.log("Confirmation alert closed");
    }
    @Test(priority = 2)
    public void promptAlertTestCase(){
        driver.findElement(By.xpath("//button[contains(text() , 'Prompt')]")).click();
        Reporter.log("Prompt alert opened");
        Alert prompt = driver.switchTo().alert();
        Reporter.log("Prompt text is : " + prompt.getText());
        Assert.assertEquals("This is a JavaScript Prompt!" , prompt.getText());
        prompt.sendKeys("testing");
        Reporter.log("Text entered in alert box");
        prompt.accept();
        Reporter.log("Prompt alert closed");
    }
    @AfterTest
    public void after(){
        driver.close();
        Reporter.log("Test Ended");
    }
}
