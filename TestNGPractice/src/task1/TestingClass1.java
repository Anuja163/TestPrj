package task1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestingClass1 {
	
	@BeforeSuite
	public void beforeASuite()
	{
		System.out.println(" Before the Test Suite");
	}
	
	@AfterSuite
	public void afterASuite()
	{
		System.out.println(" After the Test Suite");
	}
	
	@BeforeTest
	public void beforeATestRun()
	{
		System.out.println("Before a Test run");
	}
	
	@AfterTest
	public void afterATestRun()
	{
		System.out.println("After a Test run");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("First method in this class");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Last method in this class");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("\t Before a test method");
		
	}


	@AfterMethod
	public void afterMethod()
	{
		System.out.println("\t After a test method");
		
	}

	@Test
	public void testcase1()
	{
		System.out.println("\t\t test case 1");
	}
	
	
	@Test
	public void testcase2()
	{
		System.out.println("\t\t test case 2");
	}
	
}
