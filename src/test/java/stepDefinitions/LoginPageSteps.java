package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import testRunner.Hooks;

public class LoginPageSteps {
    WebDriver driver;

    public LoginPageSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Open Register page")
    public void open_register_page() {
    }

    @When("Back to Login page")
    public void back_to_login_page() {
    }

    @When("Submit valid infor to Login form")
    public void submit_valid_infor_to_login_form() {
    }
}

