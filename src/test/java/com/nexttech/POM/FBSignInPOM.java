package com.nexttech.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignInPOM {
WebDriver driver;

	public FBSignInPOM (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
@FindBy (xpath="//*[@id=\"email\"]")
WebElement type_email;
public WebElement email() {
return type_email;
}

@FindBy (xpath="//*[@id=\"pass\"]")
WebElement type_password;
public WebElement password() {
return type_password;
}

@FindBy (xpath="//*[@id=\"u_0_5_Wk\"]")  
WebElement click_login;
public WebElement login() {
return click_login;
}


}
