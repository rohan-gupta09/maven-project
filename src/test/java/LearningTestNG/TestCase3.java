package LearningTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@Test(priority=2)
	public void doLogin() {
		
		System.out.println("Executing login test");
		
	}
	
	@Test(priority=1)
     public void doUserReg() {
		
		System.out.println("Executing User Reg test");
		Assert.fail("User reg test failed as sumbit button is missing");
		
	}
	
	@Test(priority=3)
	public void isSkip()
	{
		throw new SkipException("Skipping the tesdt as the  is not met");
	}
	

}
