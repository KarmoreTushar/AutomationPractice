package webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class dashboard extends SeleniumUtility {
	public dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()=' Dashboard ']")
	WebElement dashboard;

	@FindBy(css = "#appnavigator span")
	WebElement menuContainer;

	@FindBy(xpath = "//span[text()=' MARKETING']")
	WebElement marketingTab;

	@FindBy(xpath = "//span[text()=' Leads']")
	WebElement ledsTab;

	@FindBy(id = "Leads_listView_basicAction_LBL_ADD_RECORD")
	WebElement addLeadButton;
	
	@FindBy(css="#select2-chosen-2")
	WebElement prefix;
	
	@FindBy(css="#select2-results-2")
	List<WebElement> listOfPrefix;

	@FindBy(id = "Leads_editView_fieldName_firstname")
	WebElement addFirstName;

	@FindBy(id = "Leads_editView_fieldName_lastname")
	WebElement addLastName;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//span[text()='Leads']")
	WebElement allLeds;

	@FindBy(xpath = "//a[text()='Keshav']")
	List<WebElement> listOfLeads;

	public boolean dashboardIsPresentOrNot() {
		return dashboard.isDisplayed();
	}

	public void clickOnMenuContainer() {
		clickOnElement(menuContainer);
	}

	public void clickOnMarketingTab() {
		clickOnElement(marketingTab);
	}
	
	public void clickOnLeadsTab() {
		clickOnElement(ledsTab);
	}
	
	public void clickOnAddNewLeadButton() {
		clickOnElement(addLeadButton);
	}
	
	public void clickOnPrefixButton() {
		clickOnElement(prefix);
	}
	
	public void selectPrefix(String prefix) {
		for(WebElement name:listOfPrefix) {
			if(name.getText().equals(prefix)) {
				name.click();
			}
		}
	}
	
	public void insertFirstName() {
		typeInput(addFirstName, "Keshav");
	}
	
	public void inertLastName() {
		typeInput(addLastName, "Barad");
	}
	
	public void clickOnSaveButton() {
		clickOnElement(saveButton);
	}
	
	public void clickOnAllLeads() {
		clickOnElement(allLeds);
	}
	
	public boolean verifyLeadIsCreated(String leadName) {
		for(WebElement leadsName:listOfLeads) {
			if(leadsName.getText().equals(leadName)) {
				return true;
			}
		}
		return false;
	}
	
}