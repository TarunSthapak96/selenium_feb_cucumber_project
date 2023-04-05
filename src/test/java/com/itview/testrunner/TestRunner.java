package com.itview.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"Feature/calculatorModule.feature"},
		glue= {"com.itview.stepdefinition"},
		plugin= {"pretty","html:target/cucumber-report.html"},
		monochrome = true,
		tags="@Sub or  @Add"
		)



public class TestRunner {

}
