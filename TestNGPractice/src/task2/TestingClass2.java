package task2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingClass2 {

		
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Class2 -First method in this class");
		}
		
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("Class2 - Last method in this class");
		}
		
		
		@BeforeMethod (alwaysRun =true)
		public void beforeMethod()
		{
			System.out.println("\t Class2 - Before a test method");
			
		}


		@AfterMethod (alwaysRun =true)
		public void afterMethod()
		{
			System.out.println("\t  Class2 - After a test method");
			
		}

		@Test (groups ="Regression")
		public void testcase1()
		{
			System.out.println("\t\t Class2 - test case 1");
		}
		
		
		@Test (groups ="Sanity")
		public void testcase2()
		{
			System.out.println("\t\t Class2 - test case 2");
		}
		
	




}
