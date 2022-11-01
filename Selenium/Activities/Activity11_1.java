package activities;

import org.apache.xmlbeans.impl.xb.xmlconfig.impl.NsconfigImpl;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Page Title is : " + driver.getTitle());
        driver.findElement(By.id("simple")).click();
        Alert Simple = driver.switchTo().alert();
        System.out.println("Text on alert box is : " + Simple.getText());
        Simple.accept();
        driver.close();





    }
}
