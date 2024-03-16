package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import testRunner.Hooks;

public class RegisterPageSteps {
    WebDriver driver;

    public RegisterPageSteps() {
        this.driver = Hooks.driver;
    }

    @When("Input to Email")
    public void input_to_email() {

    }
    @When("Click to Submit button")
    public void click_to_submit_button() {

    }
    @Then("Get User and Password Information")
    public void get_user_and_password_information() {

    }

}
