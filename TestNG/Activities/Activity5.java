package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.*;

public class Activity5 {
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }
    @Test(groups = {"HeaderTests"})
    public void test(){
        System.out.println("Title of the page is : " + driver.getTitle());
        Assert.assertEquals("Target Practice" , driver.getTitle());
    }
    @Test(groups = {"HeaderTests"})
    public void test1(){
        WebElement thirdheader = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
        Assert.assertEquals("Third header" , thirdheader.getText());
        System.out.println("Third Header test pass");
    }
    @Test(groups = {"HeaderTests"})
    public void test2(){
        WebElement fifthheader = driver.findElement(By.xpath("//h5[contains(text() , 'Fifth header')]"));
        Assert.assertEquals("rgb(33, 186, 69)" , fifthheader.getCssValue("color"));
        System.out.println("Fifth Header test pass");
    }
    @Test(groups = {"ButtonTests"})
    public void test3(){
        WebElement olive = driver.findElement(By.xpath("//button[contains(@class , 'olive')]"));
        Assert.assertEquals("Olive" , olive.getText());
        System.out.println("olive test pass");
    }
    @Test(groups = {"ButtonTests"})
    public void test4(){
        WebElement brown = driver.findElement(By.xpath("//button[contains(@class , 'brown')]"));
        Assert.assertEquals("Brown" , brown.getText());
        System.out.println("brown test pass");
    }

    @AfterTest(alwaysRun = true)
    public void after(){
        driver.close();
    }
}
