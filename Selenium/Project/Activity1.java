package LiveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforemethod(){
    driver = new FirefoxDriver();
    }

    @Test
    public void test(){
    driver.get("https://alchemy.hguy.co/lms");
    System.out.println("Page Title is " + driver.getTitle());
    Assert.assertEquals(driver.getTitle(), "Alchemy LMS – An LMS Application");
    }

    @AfterMethod
    public void aftermethod(){
    driver.close();
    }


}
