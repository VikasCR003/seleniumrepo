package stepDefination;

import cucumber.api.junit.Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinations {

    @Given("^User is at login page$")
    public void user_is_at_login_page() throws Throwable {
System.out.println("This is Given");
    }

    @When("^User enters the logi cridentials$")
    public void user_enters_the_logi_cridentials() throws Throwable {
    	System.out.println("This is When");
    }

    @Then("^User should be forwarded to dashboard page$")
    public void user_should_be_forwarded_to_dashboard_page() throws Throwable {
    	System.out.println("This is Then");System.out.println("This is Given");
    }

}