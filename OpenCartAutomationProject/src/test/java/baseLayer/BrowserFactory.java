package baseLayer;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	WebDriver dr;
	
	public static WebDriver startApplication(WebDriver driver, String bnm, String appurl)
	{
		if(bnm.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bnm.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get(appurl);
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver dr) 
	{
		dr.quit();
		
	}

}
