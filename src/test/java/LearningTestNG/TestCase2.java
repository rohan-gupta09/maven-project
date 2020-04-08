package LearningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void validateTitle()
	{
		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";
		/*
		if(expected_title.equals(actual_title))
		{
			System.out.println("Test case Pass");
		} else 
		{
			System.out.println("test Case Fail");
		}
		*/
		Assert.assertEquals(expected_title, actual_title);
	}
	
	
}
