package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import utilities.SeleniumUtility;

public class Hooks extends SeleniumUtility{
	@Before
	public void beforeMethod() {
		System.out.println("This is before hooks method running............");
	}
	
	@AfterStep
	public void takeScreenShotOnFailure(Scenario scenario) {
		System.out.println("This is after hooks method running............");
		if(scenario.isFailed()) {
			final byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", scenario.getName());
		}
	}
	
	@BeforeStep
	public void beforeStepMethod() {
		System.out.println("This is beforeStep hooks method running............");
		
	}
	//@AfterStep
	public void afterStepMethod() {
		System.out.println("This is afterHook hooks method running............");
	}

}
