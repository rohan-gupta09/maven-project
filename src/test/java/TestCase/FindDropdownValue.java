package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FindDropdownValue {

	public static void main(String[] args) {
		
		//System.getProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\gchromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www1.incometaxindiaefiling.gov.in/e-FilingGS/Registration/RegistrationHome.html");
		System.out.println("Pass 1");
        //driver.findElement(By.id("userTypeSel")).sendKeys("Individual");
        
        Select select = new Select(driver.findElement(By.id("userTypeSel")));
        //select.selectByVisibleText("Individual"); //calling by testvalues
       // select.selectByValue("11");               // calling by value
        select.selectByIndex(1);
        List<WebElement> opions = select.getOptions();
         System.out.println(opions.size());
         
         for(int i=0; i<opions.size();i++)
         {
        	 System.out.println(opions.get(i).getText());
         }
         
         System.out.println("*************************************************");
         System.out.println("How to print all function to another way your logic");
         List<WebElement> options =  driver.findElements(By.tagName("option"));
         System.out.println(options.size());
         for(int j=0 ; j<options.size(); j++)
         {
        	 System.out.println(options.get(j).getAttribute("value"));
        	 
         }
         
         System.out.println("Print all links form the page");
         WebElement block = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]"));
         List<WebElement> link = block.findElements(By.tagName("a"));
         System.out.println(link.size());
         
         for(int k =0; k<link.size(); k++)
         {
        	 
        	 System.out.println(link.get(k).getAttribute("href"));
         }
         
         System.out.println("Print all link = "+link.size());
         
         
	}

}
