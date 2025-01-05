package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseClass;

public class TC002_Login extends BaseClass {

	@Test
	public void TestLogin() {
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		
		hp.Login();
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("Password"));
		lp.radio_btn();
		lp.btn_login();
		
	}
}
