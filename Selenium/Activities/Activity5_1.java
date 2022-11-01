package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Page title is : " + driver.getTitle());
        WebElement checkbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
        System.out.println("Checkbox is displayed : " + checkbox.isDisplayed());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Checkbox is again displayed : " + checkbox.isDisplayed());
        driver.close();

    }
}
