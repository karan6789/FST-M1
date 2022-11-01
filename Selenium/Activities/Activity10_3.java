package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
        Actions action = new Actions(driver);
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Page Title is : " + driver.getTitle());

        WebElement dropzone1 = driver.findElement(By.xpath("//div[@id = 'droppable']"));
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id = 'dropzone2']"));
        WebElement ball = driver.findElement(By.id("draggable"));

        wait.until(ExpectedConditions.elementToBeClickable(ball));

        action.dragAndDrop(ball , dropzone1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone1 , "background-color"));
        System.out.println("Ball moved to Dropzone1");

        action.dragAndDrop(ball , dropzone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(dropzone2 , "background-color"));
        System.out.println("Ball moved to Dropzone2");

        driver.close();



    }
}