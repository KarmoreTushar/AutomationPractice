package stepDefinitions;

import org.apache.logging.log4j.*;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;
import webPages.dashboard;
import webPages.loginPage;

public class dashboardStepDefinition extends SeleniumUtility {

	dashboard dd;
	loginPage lpage;
	
	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String id, String pass) {
		log = LogManager.getLogger("dashboardStepDefinition");
		lpage = new loginPage(driver);
		lpage.enterUsername(id);
		log.info("User has successfully entered the usename");
		lpage.enterPassword(pass);
		log.info("User has successfully entered the usename");
	}

	@When("User clicks on menu-container")
	public void user_clicks_on_menu_container() {
		
		dd = new dashboard(driver);
		dd.clickOnMenuContainer();
		log = LogManager.getLogger("dashboardStepDefinition");
		log.info("User successfully click on menu container");
	}

	@When("Clicks on Marketing tab")
	public void clicks_on_marketing_tab() {
		dd.clickOnMarketingTab();
		log.info("User successfully click on menu container");
	}

	@When("Clicks on Leads tab")
	public void clicks_on_leads_tab() {
		dd.clickOnLeadsTab();
		log.info("User successfully click on leads tab");
	}

	@When("User clicks on add lead button")
	public void user_clicks_on_add_lead_button() {

		dd.clickOnAddNewLeadButton();
	}

	@When("User enters all the required fields")
	public void user_enters_all_the_required_fields() {
		dd.selectPrefix("Mr.");

	}

	@When("Clicks on save button")
	public void clicks_on_save_button() {
		dd.clickOnSaveButton();
		log.info("User successfully click on save button");
	}

	@When("Clicks on leads button")
	public void clicks_on_leads_button() {
		dd.clickOnAllLeads();

	}

	@Then("Verify lead is created")
	public void verify_lead_is_created() {
		boolean flag = dd.verifyLeadIsCreated("Keshav");
		Assert.assertTrue(flag, "Lead is not created");

	}

}
