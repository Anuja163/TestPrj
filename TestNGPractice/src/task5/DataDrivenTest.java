package task5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
   WebDriver driver;
	
	
	@BeforeMethod
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuja\\eclipse-workspace\\TestNGPractice\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/v4");
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	

	@Test(dataProvider= "getData", dataProviderClass= TestData.class)
	public void loginToApp(String username, String password)
	{
		
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
	}
	

}
