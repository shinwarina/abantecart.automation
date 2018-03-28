package com.abantecart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber-report"},
		tags= "",
		features="src/test/resources/com/abantecart/features",
		glue="com/abantecart/step_defs",
		dryRun=true
		)
public class CukesRunner extends AbstractTestNGCucumberTests {
	
}
