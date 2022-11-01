package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity1_GoogleSearchSteps extends BaseClass {
    @Given("^User is on Google Home Page$")
    public void Homepage(){
        driver.get("https://www.google.com/");
    }
    @When("^User types in Cheese and hits ENTER$")
    public void type(){
        WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
        searchbar.sendKeys("Cheese");
        searchbar.sendKeys(Keys.ENTER);
    }
    @Then("^Show how many search results were shown$")
    public void searchcount(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='result-stats']")));
        System.out.println("Number of results are : " + driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
    }
    @And("^Close the browser$")
    public void close(){
        driver.close();
    }
}
