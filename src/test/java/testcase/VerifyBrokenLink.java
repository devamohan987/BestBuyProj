package testcase;

import base.ProjectSpecification;
import pages.HomePage;

public class VerifyBrokenLink extends ProjectSpecification {
	
	public void brokenLink() {
		new HomePage(driver)
		.verifyURL("https://www.bestbuy.com/");
		
	}
	
}
