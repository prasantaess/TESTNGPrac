package testngprac;

import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgGroup {
  @Test (groups= {"Regression"})
  public void GroupRegression() {
	  
	System.out.println("This is group Regression");  
  }
  
  @Test (groups= {"Sanity"})
  public void GroupSanity() {
	  
	System.out.println("This is group Sanity");  
  }
  
  @Test (groups= {"Smome"})
  public void GroupSmome() {
	  
	System.out.println("This is group Smoke");  
  }
  
  
  @Test (groups= {"E2E"})
  public void GroupE2E() {
	  
	System.out.println("This is group E2E");  
  }
  
 
  @Test (alwaysRun= true)
  public void GroupalwaysRunTrue() {
	  
	System.out.println("This is Always Run true");  
  }
  
  
  @Test (alwaysRun= false)
  public void GroupalwaysRunfalse() {
	  
	System.out.println("This is Always Run False");  
  }
  
  @Test (dependsOnGroups="Sanity")
  public void GroupdependsOnGroupsSanity() {
	  
	System.out.println("This is Depends On Groups");  
  }
  
  @Test (dependsOnMethods="GroupRegression")
  public void dependsOnMethodsGroup7() {
	  
	System.out.println("This is Depends On Methods GroupRegression");  
  }
  
  @Test (dependsOnMethods="GroupalwaysRunfalse")
  public void Group9() {
	  
	System.out.println("This is Depends On Group always Run false");  
  } 
  
  @Test (alwaysRun=true, dependsOnMethods="GroupalwaysRunfalse")
  public void GroupARandDM() {
	  
	System.out.println("This is Depends On Group always Run false Always Run False");  
  } 
  
  @Test (alwaysRun=false, dependsOnMethods="GroupdependsOnGroupsSanity")
  public void Group11() {
	  
	System.out.println("This is Depends On Group 6 Always Run False");  
  } 
  
  @Test(timeOut=100)
  public void timeoutsSes() {
	  System.out.println("timeoutsSed");
  }
  
  @Test(threadPoolSize=4, invocationCount=4)
  public void ThreadpoolSize() {
	  
	  System.out.println("threadPoolSize");
  }
  
  @Test(expectedExceptions=ArithmeticException.class)
  public void expectedExceptions() {
	  int x=0;
	  int y=5;
	  int z= y/x;
	  System.out.println("expectedExceptions");
  }
 @Test
  @Parameters({"Url","Url2"})
  public void parameter(String Url1, String Url2) {
	  
		  System.out.println(" Prameter Value 1 is ...."+Url1);
		  System.out.println(" Prameter Value 2 is ...."+Url2);
	  	  
  }
  
 @Test
 @Ignore
 public void Ignore() {
	  
		  System.out.println("This Is Ignore annotation Test");
	  	  
 }
 
 @Test
 @Parameters("Url1")
 public void OptionalTest(@Optional("http:://www.myntra.com")String Url1) {
	 
	 System.out.println("This is optionalTest"+Url1);
	 
 }
 
 @Test
 @Parameters("Url1")
 public void OptionalTest2(@Optional("http:://www.flipkart.com")String Url1) {
	 
	 System.out.println("This is optionalTest"+Url1);
	 
 }
}
