package com.abantecart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags= "@Smoke",
		features="src/test/resources/com/abantecart/features",
		glue="com/abantecart/step_defs",
		dryRun=false
		)
public class CukesRunner extends AbstractTestNGCucumberTests {
	
}
