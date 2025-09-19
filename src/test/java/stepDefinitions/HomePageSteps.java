package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {

    HomePage homePage = new HomePage();


    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        homePage.navigateToPage();
    }
    @When("The user clicks add users button")
    public void the_user_clicks_add_users_button() {

        homePage.clickAddUserButton();

    }
    @Then("The User is navigated to fill form screen")
    public void the_user_is_navigated_to_fill_form_screen() {
        // Write code here that turns the phrase above into concrete actions
        //You can validate the popUp here if its visible
    }
}
