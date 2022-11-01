package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credential() {
            return new Object[][] {{"admin" , "password"}};
    }

    @Test(dataProvider = "Authentication")
    public void test(String Username , String Password){
        WebElement user = driver.findElement(By.xpath("//input[@id = 'username']"));
        user.sendKeys(Username);
        WebElement pass = driver.findElement(By.xpath("//input[@id = 'password']"));
        pass.sendKeys(Password);

        driver.findElement(By.xpath("//button[contains(text() , 'Log in')]")).click();

        WebElement confirm = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        Assert.assertEquals("Welcome Back, admin" , confirm.getText());

    }

    @AfterClass
    public void after(){
        driver.close();
    }
}
