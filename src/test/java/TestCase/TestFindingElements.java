package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFindingElements {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\gchromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
    	System.out.println("Open by gamil page");
    	driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    	WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("rohankg09@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        System.out.println("pass");
        WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("jshskjdhsd");
		driver.findElement(By.className("CwaK9")).click();
        
		
	/*	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Open by FB page");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("rohankg09@gmail.com");
        System.out.println("pass");
        WebElement pass = driver.findElement(By.name("pass"));
        System.out.println("pass");
        pass.sendKeys("hfhfkfhkfhdk");
        driver.findElement(By.id("u_0_2")).click();
        
        //this code is run by on facebook
        */
        
	}

}
