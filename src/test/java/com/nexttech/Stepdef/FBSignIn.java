package com.nexttech.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.POM.FBSignInPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBSignIn {
WebDriver driver;
	@Given("^I visit FB homepage$")
	public void i_visit_FB_homepage() throws Throwable {
	  // System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	 WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	   driver.get("http://facebook.com"); 
	   driver.manage().window().maximize();
	}

	@When("^I type \"([^\"]*)\" and \"([^\"]*)\" and click log in$")
	public void i_type_and_and_click_log_in(String arg1, String arg2) throws Throwable {
	    FBSignInPOM obj = new FBSignInPOM (driver);
	    obj.email().sendKeys(arg1);
	    obj.password().sendKeys(arg2);
	    //obj.login().click();
	}

	@Then("^I am able to sign in FB$")
	public void i_am_able_to_sign_in_FB() throws Throwable {
	    
	}


}
