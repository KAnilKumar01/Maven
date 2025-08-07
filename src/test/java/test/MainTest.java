package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class MainTest extends BaseTest{
	LoginPage var;
	@Test(priority=1)
	public void testLoginButtonDisabledWhenFieldAreEmpty() {
		 var=new LoginPage(driver);
		 var.testLoginButtonDisabledWhenFieldAreEmpty();
		 
	}
	@Test(priority=2)
	public void testInvalidLoginShowErrorMsg() {
		var=new LoginPage(driver);
		var.testInvalidLoginShowErrorMsg("anil","anil@1");
		
	}
	
	
	@Test(priority=3)
	public void testPasswordMaskedbutton() {
		var=new LoginPage(driver);
		var.testPasswordMaskedbutton("abc5115");
		String a=driver.getTitle();
		System.out.println("Title name:"+a);
	}
	
}
