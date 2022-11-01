package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        System.out.println("Title of the page is " + driver.getTitle());

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9988998899");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        driver.close();



    }
}

