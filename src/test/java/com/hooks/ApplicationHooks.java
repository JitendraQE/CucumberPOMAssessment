package com.hooks;

import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverFactoryManager;
import com.pages.RegistrationPage;
import com.stepdefinitions.RegistrationPageSteps;
import com.utill.SharedContext;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	private DriverFactoryManager driverFactory;
	private WebDriver driver;
	
	@Before(order = 0)
	public void launchBrowser() {
		String browserName = "chrome";
		driverFactory = new DriverFactoryManager();
		driver = driverFactory.init_driver(browserName);
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

}
