package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page is " + driver.getTitle());

        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.sendKeys("Test");

        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.sendKeys("Tester");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Test@test.com");

        WebElement number = driver.findElement(By.id("number"));
        number.sendKeys("9988998899");

        //driver.findElement(By.className("ui green button")).click();
        //driver.findElement(By.cssSelector(".ui.green.button")).click();
          driver.findElement(By.cssSelector("input.green")).click();

        driver.close();



    }

}
