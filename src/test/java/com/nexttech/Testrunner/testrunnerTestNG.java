package com.nexttech.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testrunnerTestNG {

	@RunWith(Cucumber.class)	
		@CucumberOptions (

				features = {"Features"},
				glue = {"com.nexttechitc.Stepdef"}			
				//tags= {"@sc2","@sc1"}
				)					
				public class TestRunner extends AbstractTestNGCucumberTests{}
}
