package com.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/com/features"},
		glue= {"com/stepdefinitions","com/hooks"},
		plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
		monochrome=true,
		tags = "not @Sequential"
		)

public class ParallelTestRunner  extends AbstractTestNGCucumberTests{
	
	
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		System.out.println(System.getProperty("cucumber.filter.tags"));
		return super.scenarios();
	}

}
