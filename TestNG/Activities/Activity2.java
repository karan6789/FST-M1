package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void beforemethod(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void test1(){
        System.out.println("Title of the page is : " + driver.getTitle()  );
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void test2(){
       WebElement button = driver.findElement(By.xpath("//button[contains(@class , 'black')]"));
       Assert.assertEquals(button.getText() , "black");
    }

    @Test(enabled = false)
    public void test3(){
        System.out.println("Third Method is not skipped");
    }

    @Test
    public void test4(){
    throw new SkipException("Test Case Skipped");
    }

    @AfterMethod
    public void aftermethod(){
        driver.close();
    }
}
