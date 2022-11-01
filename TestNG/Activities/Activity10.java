package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity10 {
    WebDriver driver;
    Actions action;
    @BeforeClass
    public void before(){
        driver = new FirefoxDriver();
        action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/sliders");
    }
    @Test(priority = 0)
    public void Slidermiddle(){
        WebElement slider = driver.findElement(By.xpath("//input[@id = 'slider']"));
        action.clickAndHold(slider).moveByOffset(1,0).release().build().perform();
        WebElement level = driver.findElement(By.cssSelector("span#value"));
        Reporter.log("Volume level is " + level.getText());
        System.out.println("Volume level is " + level.getText());
        Assert.assertEquals("50" , level.getText());
    }
    @Test(priority = 1)
    public void Sliderrightmax(){
        WebElement slider = driver.findElement(By.xpath("//input[@id = 'slider']"));
        action.clickAndHold(slider).moveByOffset(80,0).release().build().perform();
        WebElement level = driver.findElement(By.cssSelector("span#value"));
        Reporter.log("Volume level is " + level.getText());
        System.out.println("Volume level is " + level.getText());
        Assert.assertEquals("50" , level.getText());
    }
    @Test(priority = 2)
    public void Sliderleft(){
        WebElement slider = driver.findElement(By.xpath("//input[@id = 'slider']"));
        action.clickAndHold(slider).moveByOffset(-80,0).release().build().perform();
        WebElement level = driver.findElement(By.cssSelector("span#value"));
        Reporter.log("Volume level is " + level.getText());
        System.out.println("Volume level is " + level.getText());
        Assert.assertEquals("0" , level.getText());
    }
    @Test(priority = 3)
    public void Slider30(){
        WebElement slider = driver.findElement(By.xpath("//input[@id = 'slider']"));
        action.clickAndHold(slider).moveByOffset(-30,0).release().build().perform();
        WebElement level = driver.findElement(By.cssSelector("span#value"));
        Reporter.log("Volume level is " + level.getText());
        System.out.println("Volume level is " + level.getText());
        Assert.assertEquals("30" , level.getText());
    }
    @Test(priority = 4)
    public void Slider80(){
        WebElement slider = driver.findElement(By.xpath("//input[@id = 'slider']"));
        action.clickAndHold(slider).moveByOffset(40,0).release().build().perform();
        WebElement level = driver.findElement(By.cssSelector("span#value"));
        Reporter.log("Volume level is " + level.getText());
        System.out.println("Volume level is " + level.getText());
        Assert.assertEquals("80" , level.getText());
    }
    @AfterClass
    public void after(){
        driver.close();
    }
}
