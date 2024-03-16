package stepDefinitions;
import PageObjects.HomePageObject;
import PageObjects.RegisterPageObject;
import PageUIs.HomePageUI;
import commons.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;


public class RegisterPageStep extends BasePage {
    WebDriver driver;
    HomePageObject homePage;
    RegisterPageObject registerPage;
    @Before
    public void open_application() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        homePage = new HomePageObject(driver);
        registerPage = new RegisterPageObject(driver);
        firstName = "Thao";
        lastName = "Nguyen";
        emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
        password = "123456";
    }



    @When("Click on the Register Page")
    public void click_on_the_register_page() {
        homePage.clickToRegisterLink();
    }
    @When("Input the First name and Last Name")
    public void input_the_first_name_and_last_name() {
        registerPage.inputToFirstNameTextBox(firstName);
        registerPage.inputToLastNameTextBox(lastName);
    }
    @When("Input valid Email")
    public void input_valid_email() {
        registerPage.inputToEmailTextBox(emailAddress);

    }
    @When("Input the Password and Confirm Password")
    public void input_the_password_and_confirm_password() {
        registerPage.inputToPasswordTextBox(password);
        registerPage.inputToConfirmPasswordTextBox(password);

    }
    @When("Click to the Register Button")
    public void click_to_the_register_button() {
        registerPage.clickToRegisterButton();

    }
    @Then("Verify Register Page")
    public void verify_register_page() {
        registerPage.getSuccessEmailMessage();

    }
    @After
    public void close_application(){
        driver.quit();
    }
    public int generateFakeNumber() {
        Random rand = new Random();
        return rand.nextInt(9999);
    }

    private String firstName, lastName, emailAddress, password;

}
