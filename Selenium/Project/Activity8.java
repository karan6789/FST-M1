package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeTest
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test(priority = 0)
    public void contactnavigation(){
        WebElement contact = driver.findElement(By.xpath("//a[contains(text() , 'Contact')]"));
        contact.click();
    }
    @Test(priority = 1)
    public void contactform(){
        WebElement fullname = driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
        fullname.sendKeys("Test Tester");
        WebElement email = driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']"));
        email.sendKeys("test@test.com");
        WebElement message = driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']"));
        message.sendKeys("Testing in progress");
        driver.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
    }
    @Test(priority = 2)
    public void confirmation(){
        WebElement confirmation = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p"));
        System.out.println("Confirmation text is : " + confirmation.getText());
        Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly." , confirmation.getText());
    }
    @AfterTest
    public void after(){
        driver.close();
    }
}
