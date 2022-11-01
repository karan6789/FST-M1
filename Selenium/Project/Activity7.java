package LiveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Activity7 {
    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void test(){
        WebElement allcourses = driver.findElement(By.xpath("//a[contains(text() , 'All Courses')]"));
        allcourses.click();
        List <WebElement> totalnumberofcourses = driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div"));
        System.out.println("Total number of courses are : " + totalnumberofcourses.size());
    }
    @AfterMethod
    public void after(){
        driver.close();
    }
}
