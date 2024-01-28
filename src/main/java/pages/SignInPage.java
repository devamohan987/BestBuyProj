package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignInPage extends ProjectSpecification {

	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(id="fld-e")
	WebElement email1;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	WebElement pass;
	
	@FindBy(xpath="//span[@class='c-toggle-slider c-toggle-round']")
	WebElement showpword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clicksignin;
		
	//constructor initialization
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	       PageFactory.initElements(driver, this);
	       	
	}
	
    public SignInPage clickSignIn() throws InterruptedException {
    	sleep();
    	click(signin);
    	return this;
    }
    
    public SignInPage emailEnter(String email) throws InterruptedException {
    	sleep();
    	sendKeys(email1,email);
    	return this;
    }
    
    public SignInPage passWord1(String pass1) {
    	sendKeys(pass,pass1);
    	return this;
    }
    
    public SignInPage showPassword() throws InterruptedException {    	
    	click(showpword);
    	return this;
    }
    
    public SignInPage clickSignInButton() {
    	click(clicksignin);
    	return this;
}
	
}
