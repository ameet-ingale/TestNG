package annotations;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter repo = new ExtentSparkReporter(path);
	//repo.config().setReportName("Automation Report");
	
	
	
	
	
	
	

}