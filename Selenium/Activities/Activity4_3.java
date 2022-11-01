package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is " + driver.getTitle());

        WebElement third = driver.findElement(By.xpath("//h3[@id='third-header']"));
        System.out.println("Text is " +third.getText() );

        WebElement fifth = driver.findElement(By.xpath("//h5[@class='ui green header']"));
        System.out.println("Color of fifth header is " + fifth.getCssValue("color"));

        WebElement violet = driver.findElement(By.xpath("//button[contains(text(),'Violet')]"));
        System.out.println("Violet button class attributes are " +violet.getAttribute("class"));

        WebElement grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        System.out.println("text on grey button is " + grey.getText());

        driver.close();
    }
}
