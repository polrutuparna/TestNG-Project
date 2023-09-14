package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//this is the line i want to push on github
public class LoginPageObjects {

	public WebDriver driver;  //This driver dont have scope

	//driver.findElement(By.xpath("//hshsju")).sendKeys("test");
	
	private By username=By.xpath("//input[@id='username']");
	private  By password=By.xpath("//input[@id='password']");
	private By logIn=By.xpath("//input[@id='Login']");
	private By tryForFree=By.xpath("//a[@id='signup_link']");

	By actualErrorMessage=By.xpath("//div[@id='error']");
	
	public LoginPageObjects(WebDriver driver2) {
	
		this.driver=driver2;
	}


	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	
	
	public WebElement enterPssword() {
		return driver.findElement(password);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(logIn);
	}
	
	
	public WebElement clickOnTryForFree() {
		return driver.findElement(tryForFree);
	}
	
	
    
    public WebElement errorMessage() {
  		return driver.findElement(actualErrorMessage);
  	}
      
	
	//This is anudip comment
  //This is anudip comment
	
	
	

	
	
	
	
	
	
}