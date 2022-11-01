package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr[1]/td"));
        System.out.println("Column size is : " + columns.size());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tbody/tr"));
        System.out.println("Row size is : " + rows.size());

        WebElement cellvaluebefore = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Before Second Row and Second Column cell text is : " + cellvaluebefore.getText());

        driver.findElement(By.xpath("//table[@id = 'sortableTable']/thead/tr[1]/th")).click();

        WebElement cellvalueafter = driver.findElement(By.xpath("//table[@id = 'sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("After Second Row and Second Column cell text is : " + cellvalueafter.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id = 'sortableTable']/tfoot/tr/th"));
        for(WebElement value : footer) {
            System.out.println("Footer text is : " +value.getText());
        }

        driver.close();
    }
}
