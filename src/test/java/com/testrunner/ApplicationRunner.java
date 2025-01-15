package com.testrunner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.utill.ExecutionContext;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/com/features"},
		glue= {"com/stepdefinitions","com/hooks"},
		plugin= {"pretty","html:target/cucumber-reports1","json:target/cucumber1.json"},
		monochrome=true,
		tags = "@Sequential"
		)

public class ApplicationRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
	{
		System.out.println("Print Execution : "+ExecutionContext.isParallel());
		  if (!ExecutionContext.isParallel()) {
		        System.setProperty("dataproviderthreadcount", "1");
		    }

		return super.scenarios();
	}
	
}
