package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserUtils;
import utils.ReusableMethods;

public class SampleSteps extends BaseStep {

	public static final Logger LOGGER = LogManager.getLogger(SampleSteps.class);

	@Given("User does something")
	public void user_does_something() {
		System.out.println("Given -> User does something");
		LOGGER.info("Something happened");
	}

	@When("User does a certain thing")
	public void user_does_a_certain_thing() {
		System.out.println("When -> User does a certain thing");
		LOGGER.info("Something certain happened");
	}

	@Then("Something special is happened")
	public void something_special_is_happened() {
		System.out.println("Then -> Something special is happened");
		LOGGER.info("Something special happened");
	}
}