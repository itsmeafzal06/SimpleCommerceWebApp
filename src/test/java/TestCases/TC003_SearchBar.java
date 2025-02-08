package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;
import TestBase.BaseClass;

public class TC003_SearchBar extends BaseClass {
	
	@Test
	public void TestSearch() {
		
		try {
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		SearchPage sp = new SearchPage(driver);
		
		hp.Login();
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("Password"));
		lp.radio_btn();
		lp.btn_login();
		
		hp.Search(p.getProperty("item"));
		Thread.sleep(3000);
		hp.search_btn();
		
		Assert.assertEquals("Esprit Ruffle Shirt" ,sp.itemT());
		
		}
		catch(Exception e) {
			Assert.fail();
		}
	}

}
