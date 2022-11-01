package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void before(){
    driver = new FirefoxDriver();
    }
    @Test
    public void test(){
        driver.get("https://www.training-support.net/selenium/login-form");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");
        WebElement signin = driver.findElement(By.xpath("//button[text()='Log in']"));
        signin.click();
        WebElement message = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        Assert.assertEquals(message.getText() , "Welcome Back, admin");
    }
    @AfterClass
    public void after(){
        driver.close();
    }
}
