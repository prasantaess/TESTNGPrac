package testngprac;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgPriority {
  @Test (priority=1) 
  public void Test1() {
	  System.out.println("This is test 1..");
	  Assert.assertEquals(false, true);
  }
  
  @Test(priority=0, retryAnalyzer = Analyzer.RetryAnalyzer.class)
  public void Test2() {
	  System.out.println("This is test 2..");
	  Assert.assertEquals(false, true);
  }
  
  @Test (priority=-1)
  public void Test3() {
	  System.out.println("This is test 3..");
  }
  
  
  @Test(priority=-000)
  public void Test4() {
	  System.out.println("This is test 4..");
  }
  
  @Test (priority=500)
  public void Test5() {
	  System.out.println("This is test 5..");
  }
  
  @Test (priority=-100)
  public void Test6() {
	  System.out.println("This is test 6..");
  }
  
  
  
  
  
}
