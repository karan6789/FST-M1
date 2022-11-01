package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void before(){

        driver = new FirefoxDriver();
    }

    @Test
    public void test(){
        driver.get("https://alchemy.hguy.co/lms");
        WebElement myaccount = driver.findElement(By.xpath("//a[contains(text() , 'My Account')]"));
        myaccount.click();
        System.out.println("Title of my account page is  :  " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "My Account – Alchemy LMS");
    }

    @AfterMethod
    public void after(){

        driver.close();
    }
}
