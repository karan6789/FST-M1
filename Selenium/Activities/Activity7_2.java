package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println("Page title is : " + driver.getTitle());
        driver.findElement(By.xpath("//input[contains(@class , '-username')]")).sendKeys("Test");
        driver.findElement(By.xpath("//input[contains(@class , '-password')]")).sendKeys("Tester");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[starts-with(@class , 'email-')]")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//button[@onclick = 'signUp()']")).click();
        System.out.println("Signup message is : " + driver.findElement(By.xpath("//div[@id = 'action-confirmation']")).getText());
        //driver.close();

    }
}
