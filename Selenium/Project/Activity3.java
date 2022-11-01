package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new FirefoxDriver();
    }

    @Test
    public void test(){
        driver.get("https://alchemy.hguy.co/lms");
        WebElement title = driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']"));
        System.out.println("Title of the first box is " + title.getText());
        Assert.assertEquals(title.getText(), "Actionable Training");
    }

    @AfterMethod
    public void after(){
        driver.close();
    }
}
