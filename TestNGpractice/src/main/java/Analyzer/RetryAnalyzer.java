package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

// Code for run the failed test case once again
public class RetryAnalyzer implements IRetryAnalyzer {
	
	int counter =0;
	int RetrycounterLinit=3;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(counter < RetrycounterLinit ) {
			counter++;
			return true;
		}		
		return false;
	}
	

	

}
