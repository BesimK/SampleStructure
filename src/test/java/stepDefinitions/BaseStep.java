package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Pages;
import utils.ReusableMethods;

public class BaseStep {

	protected final Pages PAGES = new Pages();

	protected final ReusableMethods methods = new ReusableMethods();

	protected final WebDriver DRIVER = Driver.getDriver();

}