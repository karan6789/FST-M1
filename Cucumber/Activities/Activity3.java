package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;
    Alert popup;

    @Given("^User is on the page$")
    public void given(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver , Duration.ofSeconds(20));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @When("^User clicks the Simple Alert button$")
    public void when(){
    driver.findElement(By.xpath("//button[@id='simple']")).click();
    }
    @When("^User clicks the Confirm Alert button$")
    public void when1(){
    driver.findElement(By.xpath("//button[@id='confirm']")).click();
    }
    @When("^User clicks the Prompt Alert button$")
    public void when2(){
    driver.findElement(By.xpath("//button[@id='prompt']")).click();
    }
    @Then("^Alert opens$")
    public void then(){
        popup = driver.switchTo().alert();
    }
    @And("^Read the text from it and print it$")
    public void and(){
        System.out.println("Popup text is : " + popup.getText());
    }
    @And("^Write a custom message in it$")
    public void and1(){
        popup.sendKeys("Test");
    }
    @And("^Close the alert$")
    public void and2(){
        popup.accept();
    }
    @And("^Close the alert with Cancel$")
    public void and3(){
        popup.dismiss();
    }
    @And ("^Read the result text$")
    public void and4(){}
    @And("^Close Browser$")
    public void and5(){
        driver.close();
    }
}
