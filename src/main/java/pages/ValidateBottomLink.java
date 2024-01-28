package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class ValidateBottomLink extends ProjectSpecification {

	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement termcondition;
	
	//constructor initialization
	public ValidateBottomLink(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	public ValidateBottomLink navigateToBottom() {
		moveToElement(termcondition);
		click(termcondition);
		return this;
		}
	
	public ValidateBottomLink verifyTermsAndConditions(String expected) {
		validateTitle(expected);
		return this;
		
		
	}
	
}
