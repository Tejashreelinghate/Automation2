package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass1
{
	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("Before class TestingClass1");
	}
	@AfterClass
	public void afterClass()
	
	{
		System.out.println("After class TestingClass1");
	}
	
	
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method TestingClass1");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method TestingClass1");
	}
	
	
	
	@Test
	public void testCase1()
	{
		System.out.println("Test 1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("Test 2");
	}


	@Test(priority=0)
	public void test3()
	{
		System.out.println("Testing 3");
		
	}
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Testing 1");
		
	}
		
		@Test(priority=2)
		public void test2()
		{
			System.out.println("Testing 2");
			
		}
}