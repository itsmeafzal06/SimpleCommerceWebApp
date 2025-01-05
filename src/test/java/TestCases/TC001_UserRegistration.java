package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import TestBase.BaseClass;

public class TC001_UserRegistration extends BaseClass{

	@Test
	public void TesRegisteration() {
	try {
		HomePage hp = new HomePage(driver);
		
		hp.Register();
		
		RegisterPage rp = new RegisterPage(driver);
		
		rp.email(randomString()+"@gmail.com");
		rp.fullName(randomString().toUpperCase());
		String pw=randomAlfaNumeric();
		rp.Password(pw);
		rp.cnfrmPassword(pw);
		rp.register();
		
		Assert.assertEquals(driver.getTitle(), "Home Page - SimplCommerce");
		}
	catch(Exception e) {
		Assert.fail();
	}
	}
}
