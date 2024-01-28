package testcase;

import java.io.IOException;

import base.ProjectSpecification;
import pages.HomePage;

public class CountryChoose extends ProjectSpecification {

	public void clickCountry() throws IOException {
 	   new HomePage(driver)
 	   .screenshot("Home Page");
    }	
}
