package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeMethod
    public void beforemethod(){
        driver = new FirefoxDriver();
    }

    @Test
    public void test(){
        driver.get("https://alchemy.hguy.co/lms");
        WebElement heading = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
        System.out.println("Heading of the page is " +heading.getText());
        Assert.assertEquals(heading.getText(), "Learn from Industry Experts");
    }

    @AfterMethod
    public void aftermethod(){
        driver.close();
    }
}
