package pageLayer;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver dr;
	public LoginPage(WebDriver dr)
	{
		this.dr=dr;
	}
	@FindBy(xpath="//input[@id='input-email']")WebElement username;
	@FindBy(xpath="//input[@id='input-password']")WebElement password;
	@FindBy(xpath="//button[contains(text(),'Login')]")WebElement loginbutton;
	
	
	public void loginOpenCart(String un, String pass) throws Exception
	{
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbutton.click();
			
	}

}
