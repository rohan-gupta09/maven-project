package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void createDBConn()
	{
		System.out.println("Creating DB COnncetion");
		
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("Closing DB conection");
	}
		
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		System.out.println("Closing Browesr");
		
	}

	@Test(priority=2)
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=1)
     public void doUserReg() {
		
		Reporter.log("Inside user registration test");
		System.out.println("Executing User Reg test");
		
	}

}
