package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main (String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement output = driver.findElement(By.xpath("//h3[@id = 'multi-value']"));
        //WebElement output = driver.findElement(By.id("multi-value"));
        Select multi = new Select(driver.findElement(By.xpath("//select[@id = 'multi-select']")));
        //Select multi = new Select(driver.findElement(By.id("multi-select")));
        if(multi.isMultiple()){
            multi.selectByVisibleText("Javascript");
            System.out.println(""+output.getText() );

            multi.selectByValue("node");
            System.out.println(""+output.getText());

            for(int i=4 ; i<=6 ; i++){
                multi.selectByIndex(i);
            }
            System.out.println(output.getText());

            multi.deselectByValue("node");
            System.out.println(output.getText());

            multi.deselectByIndex(7);
            System.out.println(output.getText());

            List<WebElement> allselected = multi.getAllSelectedOptions();
            for(WebElement selectedoptions : allselected)   {
                System.out.println(selectedoptions.getText());
            }

            multi.deselectAll();
            System.out.println(output.getText());


        }
driver.close();
    }
}
