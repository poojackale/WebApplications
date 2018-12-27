package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://bing.com");
		String url=driver.getCurrentUrl();
		System.out.println("the current url of the apllication is:"+url);
		driver.close();
		
	

	}

}
