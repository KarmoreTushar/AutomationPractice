package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".\\src\\test\\resources\\features" }, // feature file or folder name
		glue = { "stepDefinitions" }, dryRun = false,
		tags= "@Sanity or @Smoke",
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		monochrome = true, publish = false
		)
		
public class Runner extends AbstractTestNGCucumberTests {
	//This class will be empty
}


//tags= "@Sanity,    -->It will run only those scenarios which having Sanity tag
//tags= "@Sanity or @Smoke",  -->It will run those scenarios which having either Sanity tag or Smoke tag
//tags = ( "@Smoke and @Regression" ),   --> It will run those scenario which having both sanity and regression tag
//tags = ( "@Smoke and not @Regression" ),   --> It will run those scenario which having tag of sanity but not of regression tag



//plugin = {"pretty","html:target/cucumber-reports/reports1.html" },
//plugin = { "pretty", "json:target/cucumber-reports/reports_json.json" }, 
//plugin = { "pretty", "junit:target/cucumber-reports/reports2_xml.xml" }, 