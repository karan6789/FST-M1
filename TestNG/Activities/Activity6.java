package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    @BeforeClass
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    @Parameters({"username" , "password"})
    public void Test(String username, String password){
        WebElement user = driver.findElement(By.xpath("//input[@id = 'username']"));
        user.sendKeys(username);
        WebElement pass = driver.findElement(By.xpath("//input[@id = 'password']"));
        pass.sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text() , 'Log in')]")).click();
        WebElement confirmation = driver.findElement(By.xpath("//div[@id = 'action-confirmation']"));
        Assert.assertEquals("Welcome Back, admin" , confirmation.getText());

    }
    @AfterClass(alwaysRun = true)
    public void After(){
        driver.close();
    }
}
