package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.signUpPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class verifySignup extends baseClass {

 @Test
 public void signup() throws IOException, InterruptedException {

  LoginPageObjects LPO = new LoginPageObjects(driver);

  LPO.clickOnTryForFree().click();

  signUpPageObjects SPO = new signUpPageObjects(driver);

  Thread.sleep(5000);
  SPO.enterFirstname().sendKeys(Constant.firstName); //Here Constant is class
  SPO.enterLastname().sendKeys(Constant.lastName);

  //employee dropdown
  CommonUtilities.handleStaticDropdown(SPO.selectEmpolyee(), 1);
  
  Thread.sleep(3000);
  
  //Country
  CommonUtilities.handleStaticDropdown(SPO.selectCountry(), 1);
  
  
  
  
  


 


 }

}