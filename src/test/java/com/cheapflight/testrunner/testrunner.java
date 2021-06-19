package com.cheapflight.testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cheapflight.baseclass.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cheapflight\\feature",glue = "com.cheapflight.stepdefinition")
public class testrunner {
	

}
