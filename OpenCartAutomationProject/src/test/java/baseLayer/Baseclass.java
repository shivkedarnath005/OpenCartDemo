package baseLayer;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass 
{
	public WebDriver driver;
	public ExcelDataProvider ex;
	public ConfigDataProvider config;
	public ExtentSparkReporter htmlreporter;
	public ExtentReports extent;
	//helps to generate the logs in the test report
	public ExtentTest test;
	
	@BeforeSuite
	public void set()
	{
		ex=new ExcelDataProvider();
		config=new ConfigDataProvider();
		
	}
	
	@BeforeTest
	public void reportview()
	{
		htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/testReport.html");
		//initialize ExtentReports and attach the HtmlReporter
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	
	
	public void report()
	{
		extent.flush();
	}
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
		
	}
	@AfterSuite
	public void quit()
	{
		BrowserFactory.quitBrowser(driver);
	}
	

}
