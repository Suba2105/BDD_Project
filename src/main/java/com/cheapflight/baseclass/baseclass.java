package com.cheapflight.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.deps.com.thoughtworks.xstream.io.binary.Token.Value;

public class baseclass {
	public static WebDriver driver;
public static WebDriver browserlaunch() {
	// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\driver\\chromedriver.exe");
    driver=new ChromeDriver();
    return driver;
}

public static void window_max() {
	// TODO Auto-generated method stub
driver.manage().window().maximize();
}
public static void geturl(String url) {
	driver.get(url);
}

public static void elementsendkeys(WebElement element,String value) {
    element.sendKeys(value);
}

public static void elementclick(WebElement element) {
    element.click();
}

}
