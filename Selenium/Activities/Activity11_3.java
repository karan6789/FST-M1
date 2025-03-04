package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is " + driver.getTitle());
        driver.findElement(By.id("prompt")).click();

        Alert prompt = driver.switchTo().alert();
        System.out.println("Popup text : " +prompt.getText());
        prompt.sendKeys("Yes, you are!");
        prompt.accept();
        driver.close();



    }
}
