package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps extends BaseStep {
    @Given("User does something")
    public void user_does_something() {
        System.out.println("Given -> User does something");
    }
    @When("User does a certain thing")
    public void user_does_a_certain_thing() {
        System.out.println("When -> User does a certain thing");
    }
    @Then("Something special is happened")
    public void something_special_is_happened() {
        System.out.println("Then -> Something special is happened");
    }
}
