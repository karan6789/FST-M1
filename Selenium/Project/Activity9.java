package LiveProject;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.PriorityQueue;

public class Activity9 {
    WebDriver driver;

    @BeforeClass
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test(priority = 0)
    public void login(){
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
    @Test(priority = 1)
    public void allcourses(){
        WebElement allcourses = driver.findElement(By.xpath("//a[contains(text() , 'All Courses')]"));
        allcourses.click();
    }
    @Test(priority = 2)
    public void courseselection() {
        WebElement courseselect = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        courseselect.click();
        WebElement course = driver.findElement(By.xpath("//div[@class='ld-item-title']"));
        course.click();
        WebElement title = driver.findElement(By.xpath("//div[@class = 'ld-focus-content']/h1"));
        Assert.assertEquals("Developing Strategy" , title.getText());
        WebElement markComplete = driver.findElement(By.xpath("//*[@id='learndash_post_24183']/div/div[3]/div[2]/form/input[4]"));
        if(markComplete != null) {
            markComplete.click();
        }
        else{
            System.out.println("Mark complete button does not exists,you may have completed the course");
        }
    }

    @AfterClass
    public void after(){
        driver.close();
    }
}
