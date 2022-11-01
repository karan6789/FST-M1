package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Page Title is : " +driver.getTitle());
        WebElement button = driver.findElement(By.xpath("//button[contains(@class , 'orange ')]"));
        System.out.println("Tool Tip text is :" +button.getAttribute("data-tooltip"));
        button.click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(@class , 'green')]"))));
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        //driver.findElement(By.xpath("//button[contains(@class , 'green')]")).click();
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println("Confirmation text is : " +driver.findElement(By.id("action-confirmation")).getText());

        driver.close();


    }
}
