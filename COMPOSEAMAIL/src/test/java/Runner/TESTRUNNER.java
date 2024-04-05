package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TESTRUNNER {
	@RunWith(Cucumber.class)
	@CucumberOptions(features="/COMPOSEAMAIL/Features/sendamail.feature",
	glue = "stepdefs.java",
	dryRun = false, 
	monochrome = false)
	public class Runner {
}
}