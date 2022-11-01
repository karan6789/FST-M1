package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class FirstTest extends BaseClass {
    @Given("^User is on homepage$")
    public void openingtestpage() {
    driver.get("https://www.training-support.net");
    }

    @When("^User clicks on About Us Button$")
    public void clickabout() {
    driver.findElement(By.xpath("//a[@id = 'about-link']")).click();
    }

    @Then("^User is redirected to About Us Page$")
    public void redirection() {
    driver.getTitle();
    }
}


