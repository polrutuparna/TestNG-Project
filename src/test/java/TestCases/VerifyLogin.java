package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class VerifyLogin extends baseClass {

	@Test
	public void login() throws IOException {

		LoginPageObjects obj = new LoginPageObjects(driver);

		obj.enterUsername().sendKeys(Constant.usernamme); //Here Constant is class
		
	//	CommonUtilities.handlExplictWait(10,obj.enterPssword());

	
		obj.enterPssword().sendKeys(Constant.password); //Here Constant is class
		
	//	CommonUtilities.handlExplictWait(15,obj.clickOnLogin());
		
		
		obj.clickOnLogin().click();
		
		CommonUtilities.handleAssertions(Constant.expectedString, obj.errorMessage().getText() ); //Here Constant is class
		
		
			
		
	}

}