package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.Baseclass;
import com.utility.ExcelDataProvider;
import com.utility.Library;

public class TC001_Login extends Baseclass{

	
	@Test
	public void tc_01() throws Exception{
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);	
		
		Library.custome_sendkyes(login.getTxt_email(), ExcelDataProvider.getexceldata("Sheet1", 0, 0));
		Library.custome_sendkyes(login.getTxt_pass(), ExcelDataProvider.getexceldata("Sheet1", 0, 0));
	
		
		
	}
	
	
}
