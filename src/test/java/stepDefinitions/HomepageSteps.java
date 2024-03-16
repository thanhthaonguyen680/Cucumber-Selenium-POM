package stepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import testRunner.Hooks;


public class HomepageSteps {
    WebDriver driver;

    public HomepageSteps() {
        this.driver = Hooks.driver;
    }

    @Then("Verify Homepage display")
    public void verify_homepage_display() {

    }
}
