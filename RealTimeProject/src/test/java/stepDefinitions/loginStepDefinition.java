package stepDefinitions;

import org.apache.logging.log4j.*;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webPages.dashboard;
import webPages.loginPage;

public class loginStepDefinition extends SeleniumUtility {
	dashboard dd;
	loginPage lpage;
	
	@When("User is already on login page")
	public void user_is_already_on_login_page() {
		setUp();
		log=LogManager.getLogger("loginStepDefinition");
		log.info("Browser set method is completed...");
	}

	@When("user enter username from accepted {string} and {string} from password for all users")
	public void user_enter_username_from_accepted_and_from_password_for_all_users(String username, String password) {
		log.info("Username and password is entering...");
		lpage = new loginPage(driver);
		lpage.enterUsername(username);
		lpage.enterPassword(password);
		log.info("Username and password entered successfully...");
	}

	@When("Clicks on signin button")
	public void Clicks_on_signin_button() {
		lpage = new loginPage(driver);
		lpage.clickOnSignInButton();
		log.info("User successfully click on login button...");
	}


	@When("Quite the driver")
	public void Quite_the_driver() {
		cleanUp();
		log.info("Successfully quite the driver...");
	}

	@Then("Verify that the user is navigate to dashboard page")
	public void verify_that_the_user_is_navigate_to_dashboard_page() {
		dd = new dashboard(driver);
		Assert.assertEquals(dd.dashboardIsPresentOrNot(), true);
	}
}
