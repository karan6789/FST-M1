package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id = 'single-select']")));
        WebElement output = driver.findElement(By.xpath("//h3[@id = 'single-value']"));

        dropdown.selectByVisibleText("Option 2");
        System.out.println(output.getText());

        dropdown.selectByIndex(3);
        System.out.println(output.getText());

        dropdown.selectByValue("4");
        System.out.println(output.getText());

        List<WebElement> elements = dropdown.getOptions();
        for(WebElement alloutput : elements){
            System.out.println(""+ alloutput.getText());
        }

        driver.close();

    }
}
