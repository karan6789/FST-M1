package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> coloumn = driver.findElements(By.xpath("//table[contains(@class , 'striped')]/tbody/tr[1]/td"));
        System.out.println("Coloumn size is : " + coloumn.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class , 'striped')]/tbody/tr"));
        System.out.println("Row size is : " + rows.size());

        List<WebElement> thirdrow = driver.findElements(By.xpath("//table[contains(@class , 'striped')]/tbody/tr[3]/td"));
        for (WebElement value : thirdrow){
            System.out.println("Third Row data is : " +value.getText());
        }

        WebElement cell = driver.findElement(By.xpath("//table[contains(@class , 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second Row and Second Column cell text is : " + cell.getText());

        driver.close();

    }
}
