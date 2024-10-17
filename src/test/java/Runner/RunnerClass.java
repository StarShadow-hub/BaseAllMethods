package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\LoginFeature.feature", glue = "org.stepDefinition" , 
							 plugin = {"C:\\Users\\Vijai\\eclipse-workspace\\ReportingCucumber\\target\\reports\\reportcucumber.json"} )

public class RunnerClass {
@AfterClass
	public static void reportCucumber() {
		ReportingClass.generateReport("C:\\Users\\Vijai\\eclipse-workspace\\ReportingCucumber\\target\\reports\\reportcucumber.json");
	}
	}
