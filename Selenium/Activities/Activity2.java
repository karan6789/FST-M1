package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.training-support.net");
    System.out.println("Title of the page is " + driver.getTitle());

    System.out.println("Text using id is " + driver.findElement(By.id("about-link")).getText());
    System.out.println("Text using class name is " + driver.findElement(By.className("green")).getText());
    System.out.println("Text using link text is " + driver.findElement(By.linkText("About Us")).getText());
    System.out.println("Text using css selector is " + driver.findElement(By.cssSelector(".green")).getText());
    driver.close();
    }
}
