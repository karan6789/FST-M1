package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main (String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title is : " +driver.getTitle());
        WebElement cube = driver.findElement(By.xpath("//div[@id = 'wrapD3Cube']"));

        actions.click(cube).build().perform();
        System.out.println("Left Click Number is " + driver.findElement(By.xpath("//div[contains(@class , 'active')]")).getText());

        actions.doubleClick(cube).build().perform();
        System.out.println("Dobule Click Number is " + driver.findElement(By.xpath("//div[contains(@class , 'active')]")).getText());

        actions.contextClick(cube).build().perform();
        System.out.println("Right Click Number is " + driver.findElement(By.xpath("//div[contains(@class , 'active')]")).getText());

        driver.close();



    }

}
