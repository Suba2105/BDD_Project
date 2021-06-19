package com.cheapflight.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cheapflight.baseclass.baseclass;

public class Login extends baseclass{

	
	@FindBy(xpath = "(//*[@class='svg-image'])[1]")
	public WebElement home_logo;
	
	@FindBy(xpath = "(//div[@data-value='COK'])[1]//child::button")
	public WebElement ok_button;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
