package TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CourseTestProperties {
	
	public static WebDriver driver;
	public static Properties OR = new Properties();
    public static Properties Config = new Properties();
    public static FileInputStream fis;
    public static Logger log = Logger.getLogger(CourseTestProperties.class);
    
    
    
    public static void click(String key)
    {
    	if(key.endsWith("_CSS"))
    	{
    		driver.findElement(By.cssSelector(OR.getProperty(key))).click();
    	}else if(key.endsWith("_XPATH"))
    	{
    		driver.findElement(By.xpath(OR.getProperty(key))).click();
    	} else  if(key.endsWith("_ID"))
    	{
    		driver.findElement(By.id(OR.getProperty(key))).click();
    	} 
    	log.info("User Click on :" +key);
    }
   
    public static void type(String key, String value)
    {
    	if(key.endsWith("_CSS")) {
    		driver.findElement(By.cssSelector(OR.getProperty(key))).sendKeys(value);
    	}
    	else if(key.endsWith("_XPATH"))
    	{
    		driver.findElement(By.xpath(OR.getProperty(key))).sendKeys(value);
    	}
    	else if(key.endsWith("_ID"))
    	{
    		driver.findElement(By.id(OR.getProperty(key))).sendKeys(value);
    	}
    	
    	log.info("User Type : " +key+  "User Vales :" +value);
    }
    
    
	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "G:\\RemoteControl\\WebDrivetTestingMN\\src\\test\\resources\\executables\\gchromedriver.exe");
		
		
		
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\log4j.properties");	
		 fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
        OR.load(fis);
        log.info("OR Properties is Loaded !!!!!");
        System.out.println(OR.getProperty("username_CSS"));
        
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
        OR.load(fis);
        System.out.println(OR.getProperty("submitBtn_XPATH"));
        
        fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
        Config.load(fis);
        log.info("Config properties file loaded !!!");
        System.out.println(Config.getProperty("testsiteurl"));
        
        if(Config.getProperty("browser").equals("fireox")) {
        	System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			//driver = new FirefoxDriver();
			log.info("Firefox Launched !!!");
			
        }else if (Config.getProperty("browser").equals("chrome")) {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\gchromedriver.exe");
        	
			    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\executables\\gchromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome Launched !!!");
        }
        else if (Config.getProperty("browser").equals("ie")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info("IE Launched !!!");
        }
        
        driver.get(Config.getProperty("testsiteurl"));
        log.info("Navigated to : "+Config.getProperty("testsiteurl"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector(OR.getProperty("username_CSS"))).sendKeys("rohankg09@gmail.com");
        //driver.findElement(By.xpath(OR.getProperty("submitBtn_XPATH"))).click();
         type("username_CSS", "rohankg09@yahoo.co.in");
         click("submitBtn_XPATH");
         
    
        driver.quit();
        log.info("Test Execution Completed !!!");
        
                
	}

}
