package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^user is at web page$")
    public void user_is_at_web_page() throws Throwable {
        System.out.println("This is given");
    	
        
        
    }

    @When("^user enters the user name and password$")
    public void user_enters_the_user_name_and_password() throws Throwable {
       
    	  System.out.println("This is when");

    }

    @Then("^user should be forwarded to dashboard$")
    public void user_should_be_forwarded_to_dashboard() throws Throwable {
    	  System.out.println("This is then");
  
    }

}