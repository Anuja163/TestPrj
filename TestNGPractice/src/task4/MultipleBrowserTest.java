package task4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	
	WebDriver driver;
	
	@Parameters({"browserType"})
	@BeforeClass
	public void invokeBrowser(String browserType)
	{
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chorme.driver", "C:\\Users\\Anuja\\eclipse-workspace\\TestNGPractice\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		else if (browserType.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Anuja\\eclipse-workspace\\TestNGPractice\\msedgedriver.exe");
			
			driver = new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/v4");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@Parameters({"userId","password"})
	@Test
	public void loginToApp(String username, String password)
	{
		
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
	}
	

}
