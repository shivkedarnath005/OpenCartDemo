package testLayer;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import baseLayer.Baseclass;
import baseLayer.Util;
import pageLayer.LoginPage;

public class TestRunner extends Baseclass 
{
	
  @Test
  public void loginTest() throws Exception  
  {
	    LoginPage obj=PageFactory.initElements(driver, LoginPage.class);//login class call when we use @FindBy annotation
		obj.loginOpenCart(ex.getStringData("sheet1", 0, 0),ex.getStringData("sheet1", 0, 1));
		Thread.sleep(1000);
		
  }
  
  
}
