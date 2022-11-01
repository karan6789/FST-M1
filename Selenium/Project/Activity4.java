package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new FirefoxDriver();
    }

    @Test
    public void test(){
        driver.get("https://alchemy.hguy.co/lms");
        WebElement title = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]"));
        System.out.println("Title of the second popular course :  " + title.getText());
        Assert.assertEquals(title.getText(), "Email Marketing Strategies");
    }

    @AfterMethod
    public void after(){
        driver.close();
    }
}
