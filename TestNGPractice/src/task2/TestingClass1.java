package task2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestingClass1 {
	
	
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

		@Test (groups = {"Sanity","Regression"})
		public void testcase1()
		{
			System.out.println("\t\t test case 1");
		}
		
		
		@Test (groups ="Sanity")
		public void testcase2()
		{
			System.out.println("\t\t test case 2");
		}
		
	


}
