package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity2_LoginTestSteps extends BaseClass{
    @Given("^User is on Login page$")
    public void given(){
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void when(){
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text() , 'Log in')]")).click();
    }
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void when1(String username , String password){
        WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
        user.sendKeys(username);
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text() , 'Log in')]")).click();
    }
    @Then("^Read the page title and confirmation message$")
    public void then(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
        System.out.println("Page Title is : " +driver.getTitle());
        System.out.println("Confirmation message : " + driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
    }
    @And("^Close the Browser$")
    public void and(){
        driver.close();
    }


}
