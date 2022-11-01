package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main (String[] args ){
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/selenium/dynamic-controls");
    System.out.println("Page Title is : " + driver.getTitle());
    WebElement textfield = driver.findElement(By.xpath("//div[@id = 'dynamicText']/input"));
    System.out.println("Text field is enabled : " + textfield.isEnabled() );
    driver.findElement(By.xpath("//button[@id = 'toggleInput']")).click();
    textfield.sendKeys("Test");
    System.out.println("Text field is enabled : " + textfield.isEnabled() );
    driver.close();



    }
}
