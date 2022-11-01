package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;

    @BeforeMethod
    public void before(){
    driver = new FirefoxDriver();
    driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void test(){
        WebElement myaccount = driver.findElement(By.xpath("//a[contains(text() , 'My Account')]"));
        myaccount.click();
        System.out.println("Title of my account page is  :  " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
        WebElement login = driver.findElement(By.xpath("//a[contains(@class , 'ld-login-button')]"));
        login.click();
        WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
        username.sendKeys("root");
        WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
        password.sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        WebElement confirmation = driver.findElement(By.xpath("//div[@class='ld-section-heading']"));
        confirmation.isDisplayed();
    }
    @AfterMethod
    public void after(){
        driver.close();
    }
}

