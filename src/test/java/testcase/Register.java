package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class Register extends ProjectSpecification {

	@BeforeTest
    public void setup() {
 	   
 	   excelfile="Register Sheet";
     }
@Test(dataProvider="getData")
    public void registerTest(String fName,String lname,String eMail,String password,String rePassword,
 		   String mobno) throws InterruptedException, IOException {
 	   
    	new HomePage(driver)

      .clickAccount()
 	  .createAccount()   	  
 	  .fName(fName)
 	  .lName(lname)
 	  .eMail(eMail)
 	  .password(password)
 	  .rePassword(rePassword)
 	  .passwordShow()
 	  .mobno(mobno)
 	  .createAccountLast()    	  
 	  .screenshot("Register Sheet");
 	    	    	   
    }
	
}
