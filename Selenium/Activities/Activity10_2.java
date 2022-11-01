package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {
    public static void main (String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Page Title is : " + driver.getTitle());
        WebElement keypressed = driver.findElement(By.xpath("//div[@id = 'keyPressed']"));

        actions.sendKeys("K").build().perform();
        System.out.println("Letter is : " + keypressed.getText());

        actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println("Pasted is : " + keypressed.getText());

        driver.close();





    }
}
