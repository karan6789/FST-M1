package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page Title is : " + driver.getTitle());
        driver.findElement(By.id("confirm")).click();
        Alert confirmation = driver.switchTo().alert();
        System.out.println("Text on the pop up is : " + confirmation.getText());
        confirmation.accept();
        driver.close();


    }
}
