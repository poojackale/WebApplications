package com.TestNG;

import org.testng.annotations.Test;

public class Annotions1
{
  @Test(priority=0)
   public void browserlaunch()
   {
     System.out.println("Launch Firefox Browser");
   }
  @Test(priority=1)
   public void login()
   {
	   System.out.println("Gmail LogIn");
   }
   @Test(priority=2)
   public void inbox()
   {
	   System.out.println("Teting Inbox Functionality");
   }
   @Test(enabled=false)
   public void compose()
   {
	   System.out.println("Testing the Fuctionality of compose");
   }
}