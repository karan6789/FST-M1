package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Main Page Title is : " +driver.getTitle());
        System.out.println("Main Page Handle is : " + driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allhandle = driver.getWindowHandles();
        System.out.println("All handles are : " + allhandle);

        for (String handler : driver.getWindowHandles()) {
        driver.switchTo().window(handler);
        }

        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("Second Page Title is : " +driver.getTitle());
        System.out.println("Second page Handle is : " + driver.getWindowHandle());
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Second Page Heading & text is : " + driver.findElement(By.cssSelector("div.content")).getText());
        driver.findElement(By.id("actionButton")).click();
        //driver.findElement(By.xpath("//div[@class = 'spacer']")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for (String secondhandler : driver.getWindowHandles()){
            driver.switchTo().window(secondhandler);
        }
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("Third Page Title is : " +driver.getTitle());
        System.out.println("Third page Handle is : " +driver.getWindowHandle());
        System.out.println("Third Page Heading & text : " + driver.findElement(By.xpath("//div[@class = 'content']")).getText());

        driver.quit();
    }

}
