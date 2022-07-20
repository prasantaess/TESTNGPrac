package testngprac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGPracAnnotation {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("This Is the Before Suite.....");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This Is the Before Test.....");
	}

	@BeforeClass

	public void BeforeClass() {
		System.out.println("This Is the Before Class.....");
	}

	@Test
	public void AnnotationPrac() {

		System.out.println("This Is the Test.....");

	}
	
	@Test (dataProvider="Dataprovider")
	public void DataProvider(String val1,String val2) {
		System.out.println(val1);
		System.out.println(val2);
	}
	

	@AfterClass
	public void AfterClass() {
		System.out.println("This Is the After Class.....");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("This Is the After Test.....");
	}

	@AfterSuite

	public void AfterSuite() {
		System.out.println("This Is the After Classt.....");
	}
	
	@DataProvider(name="Dataprovider")
	public Object[][] getData(){
		return new Object[][] { 
			{"test 1", "Test 2"},
			{"test 3","Test 4"}
				
		 };

	}
	
@BeforeMethod
public void BeforeMethod() {
	System.out.println("This Is Before Method...");
}
	

@AfterMethod
public void AfterMethod() {
	System.out.println("This Is After Method...");
}
}
