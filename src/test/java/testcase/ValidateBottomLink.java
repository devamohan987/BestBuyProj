package testcase;

import java.io.IOException;

import base.ProjectSpecification;
import pages.HomePage;

public class ValidateBottomLink extends ProjectSpecification {

	public void BottomLink() throws IOException {
		new HomePage(driver)
		.clickBottomLink()
		.navigateToBottom()
		.verifyTermsAndConditions("BestBuy.com Terms and Conditions");
		
	}
	
}
