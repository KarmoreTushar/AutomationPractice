package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class loginPage extends SeleniumUtility {
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signInBtn;
	
	public void enterUsername(String userName) {
		typeInput(username, userName);
	}
	
	public void enterPassword(String pass ) {
		typeInput(password, pass);
	}
	
	public void clickOnSignInButton() {
		clickOnElement(signInBtn);
	}
	
}
