package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// added som esample line
public class signUpPageObjects {

	public WebDriver driver;
	
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By employee=By.xpath("//select[@name='CompanyEmployees']");
	
	By country = By.xpath("//select[@name='CompanyCountry']");
	
	
	
	
	public signUpPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}


	public WebElement enterFirstname() {
	
		return driver.findElement(firstname);
	}
	
	
	public WebElement enterLastname() {
		
		return driver.findElement(lastname);
	}
	
      public WebElement selectEmpolyee() {
		
		return driver.findElement(employee);
	}
	
      
      public WebElement selectCountry() {
  		return driver.findElement(country);
  	}
      

  	
	 //This is line 1
    
 	 //This is line 2
      
 	 //This is line 3
      

	
	
}