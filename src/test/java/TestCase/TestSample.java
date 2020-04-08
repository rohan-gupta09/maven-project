package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSample {

	public static void main(String[] args) {
		
		/*WebDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		String actual_title = driver.getTitle();
		String expected_title = "Gmail";
		
		driver.manage().window().maximize();
		if(actual_title.equals(expected_title))
		{
			System.out.println("Test Case Pass");
		}
		else 
		{
			System.out.println("Test case fail");
		}*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://gmail.com");
		driver.navigate().to("http://gmail.com");
		String actual_title = driver.getTitle();
		String expected_title = "Gmail";
		
		driver.manage().window().maximize();
		if(actual_title.equals(expected_title))
		{
			System.out.println("Test Case Pass");
		}
		else 
		{
			System.out.println("Test case fail");
		}
		

	}

}
