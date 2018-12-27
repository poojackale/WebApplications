package com.EpicorApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test 
{
  FirefoxDriver driver;
  @BeforeTest
  public void setup()
  {
	  FirefoxDriver driver =new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://125.18.224.122/ERP10Demo-EwA");
	  driver.findElementById("txtUserID").sendKeys("manager");
	  driver.findElementById("btnLogin").sendKeys("manager");
	  
  }
  @Test
  public void EpicorApplication()
  {
	  driver.findElementByLinkText("dynatree-title").click();
	  
  }
  
}