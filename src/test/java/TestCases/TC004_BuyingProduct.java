package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ConfirmationPage;
import PageObjects.HomePage;
import PageObjects.ItemDetailPage;
import PageObjects.LoginPage;
import PageObjects.OrderSummaryPage;
import PageObjects.PaymentPage;
import PageObjects.SearchPage;
import PageObjects.ShippingAddPage;
import TestBase.BaseClass;

public class TC004_BuyingProduct extends BaseClass {
	
	@Test
	public void TestBuyingProduct() throws InterruptedException {
	
		logger.info("*** Test Starts *****");
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		ItemDetailPage idp = new ItemDetailPage(driver);
		SearchPage sp = new SearchPage(driver);
		OrderSummaryPage osp = new OrderSummaryPage(driver);
		ShippingAddPage sap = new ShippingAddPage(driver);
		PaymentPage pp = new PaymentPage(driver);
		ConfirmationPage cp = new ConfirmationPage(driver);
		
		hp.Login();
		lp.email(p.getProperty("email"));
		lp.password(p.getProperty("Password"));
		lp.radio_btn();
		lp.btn_login();
		
		hp.Search(p.getProperty("item"));
		hp.search_btn();
		sp.itemC();
		logger.info("*** clicking on addtokart *****");
		idp.btn_AddToKart();
		logger.info("*** clicking on viewkart *****");
		idp.btn_ViewCart();
		logger.info("*** clicking on checkOUt *****");
		osp.btn_CheckOut();
		logger.info("*** clicking on Filling details *****");
		sap.txt_Name(randomString());
		sap.drpdwn_Country(p.getProperty("country"));
		sap.drpdwn_State(p.getProperty("state"));
		sap.txt_city(randomString());
		sap.txt_PostalCode(randomNumber());
		sap.txt_Address(randomString());
		sap.txt_Number(randomNumber());
		sap.btn_Payment();
		logger.info("*** Payment method selection page *****");
		pp.btn_CashOnDelivery();
		logger.info("*** Verifying order is placed or not *****");
		if(cp.txt_Cong().equals(p.getProperty("message"))) {
			logger.info("*** Verifying order is placed *****");
			Assert.assertTrue(true);
		}
		else {
			logger.info("*** Verifying order is not placed *****");
			Assert.fail();
		}
	}

}
