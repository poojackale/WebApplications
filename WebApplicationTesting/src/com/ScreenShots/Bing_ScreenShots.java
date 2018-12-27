package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Bing_ScreenShots {

	public static void main(String[] args) throws IOException 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_ScreenShot,new File("C:\\Users\\DELL PC\\Desktop\\PoojaSelenium\\WebApplicationTesting\\ScreenShots\\bing.png"));
		driver.quit();
	
	}

}
