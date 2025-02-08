package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	WebDriver driver;
	public PaymentPage(WebDriver driver) {
		super(driver);
	}

	//locators
	
	@FindBy(xpath="//button[.='Cash on Delivery']") WebElement btn_COD;
	
	//Actions
	
	public void btn_CashOnDelivery() {
		btn_COD.click();
	}
	
}
