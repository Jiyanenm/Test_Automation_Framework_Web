package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterUserPage;
import utilities.Driver;


public class RegisterUserSteps {

    Driver driver;
    RegisterUserPage registerUserPage = new RegisterUserPage();
    HomePage homePage = new HomePage();
    @Given("The user navigate into form pop up")
    public void the_user_navigate_into_form_pop_up() {
        homePage.navigateToPage();
        homePage.clickAddUserButton();
    }
    @When("The user enter {string} {string} {string} {string} {string} {string} {string} {string}")
    public void the_user_enter(String fname, String lname, String username, String password, String customerType, String role, String email, String cellPhone) {

        registerUserPage.enterFirstName(fname);
        registerUserPage.enterLastName(lname);
        registerUserPage.enterUserName(username);
        registerUserPage.enterPassword(password);
        registerUserPage.selectCustomerType(customerType);
        registerUserPage.enterRole(role);
        registerUserPage.enterEmailAddress(email);
        registerUserPage.enterCellPhone(cellPhone);
    }
    @Then("The user clicks save button")
    public void the_user_clicks_save_button() {
     registerUserPage.clickButtonSave();
    }
    @Then("Validate if the record is added")
    public void validate_if_the_record_is_added() {

        registerUserPage.checkIfTheRecordIsAdded();
    }
    @Then("The User clicks the edit button")
    public void the_user_clicks_the_edit_button() {
        registerUserPage.clickEditButton();
    }
    @And("The User click close button")
    public void the_user_click_close_button() {
        registerUserPage.clickCloseButton();
    }
    @Then("The User is searching for the user")
    public void the_user_is_searching_for_the_user() {
        registerUserPage.enterSearchKeyWord();
    }
}
