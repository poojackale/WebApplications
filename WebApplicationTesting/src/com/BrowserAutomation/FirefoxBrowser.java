package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) 
	{
	   FirefoxDriver driver =new FirefoxDriver();
	   driver.get("http://bing.com");
	   String title =driver.getTitle();
	   System.out.println("The title of the application:" +title);
	   
	   driver.quit();
	   

	}

}
