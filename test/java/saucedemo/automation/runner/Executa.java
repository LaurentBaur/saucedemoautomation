package saucedemo.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import saucedemo.automation.drivers.Drivers;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = "@login",
		glue = "saucedemo.automation.steps",
		dryRun = true,
		monochrome = false,
		plugin = {"pretty" , "html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		)

public class Executa extends Drivers{
   
	public static void iniciarTeste() {
		
	}
}
