package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class SignIn extends ProjectSpecification {

	@BeforeTest
    public void setup() {
 	  	   excelfile="SignInSheet";
     }
	 @Test(dataProvider="getData")	 
	 public void signInTest(String email1,String pass) throws IOException, InterruptedException {
		new HomePage(driver)
		.clickAccount()
		.clickSignIn()
		.emailEnter(email1)
		.passWord1(pass)
		.showPassword()
		.clickSignInButton()
		.screenshot("SignInSheet");
		
	 }
	
}
