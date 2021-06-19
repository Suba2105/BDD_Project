package com.cheapflight.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cheapflight.baseclass.baseclass;
import com.cheapflight.locators.Home_page;
import com.cheapflight.locators.Login;

public class PageObjectManager extends baseclass{

	private Home_page home_page;
	private Login login;
	
	public Home_page getHome_page() {
		if (home_page==null) {
			home_page=new Home_page();
		}
		return home_page;
	}
	
	public Login getLogin() {
		if (login==null) {
			login=new Login(driver);
		}
		return login;
	}
	
	public PageObjectManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
