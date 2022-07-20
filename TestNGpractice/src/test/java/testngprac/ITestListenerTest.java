package testngprac;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners()
public class ITestListenerTest implements ITestListener {
	
	public void onTestStart(ITestResult Result) {
			
	}
	
	public void ontestSuccess(ITestResult Result) {
		System.out.println("Success of thest cases and its details are::: " +Result.getName());
	}
	
	

}
