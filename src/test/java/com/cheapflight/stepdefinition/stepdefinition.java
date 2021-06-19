package com.cheapflight.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.cheapflight.baseclass.baseclass;
import com.cheapflight.locators.Home_page;
import com.cheapflight.locators.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class stepdefinition extends baseclass{
	Login l=new Login(driver);
	Home_page h=new Home_page();
	
	@Given("^user enter the cheap flight url$")
	public void user_enter_the_cheap_flight_url() throws Throwable {
		browserlaunch();
		geturl("https://www.in.cheapflights.com/");
		window_max();
	}

	@Then("^user verify the cheap flight logo$")
	public void user_verify_the_cheap_flight_logo() throws Throwable {
		boolean displayed =l.home_logo.isDisplayed();
		System.out.println("logo display: "+displayed);
		Assert.assertTrue(displayed);
		
	}
	@Then("^user enter the From place$")
	public void user_enter_the_From_place() throws Throwable {
	   elementclick(driver.findElement(By.xpath("(//div[@data-value='COK'])[1]//child::button")));
	   Thread.sleep(2000);
	   elementsendkeys(driver.findElement(By.xpath("(//input[@placeholder='From?'])[1]")), "GOA");
	   //elementclick(driver.findElement(By.xpath("(//*[@id=\"ap-GOA/6888\"]/div[3]/div[2]/label)")));
	 
	}

	@Then("^user enter the To place$")
	public void user_enter_the_To_place() throws Throwable {
		elementclick(driver.findElement(By.xpath("//*[@id=\"hojr-destination-airport-display\"]")));
		Thread.sleep(2000);
		elementsendkeys(driver.findElement(By.xpath("(//div[@data-placeholder='To?'])[1]")), "CHENNAI");
	   
	    
	}

	@Then("^user enter the depature date$")
	public void user_enter_the_depature_date() throws Throwable {
	   
	    
	}

	@Then("^user enter the return date$")
	public void user_enter_the_return_date() throws Throwable {
	   
	    
	}

	@Then("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
	   
	    
	}



}
