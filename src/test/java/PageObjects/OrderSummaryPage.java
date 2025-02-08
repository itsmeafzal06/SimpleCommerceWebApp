package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSummaryPage extends BasePage {

	WebDriver driver;
	public OrderSummaryPage(WebDriver driver) {
		super(driver);
	}

	//locators
	
	@FindBy(xpath="//button[.='Process to Checkout']") WebElement btn_cktOut;
	
	//Actions
	
	public void btn_CheckOut() {
		btn_cktOut.click();
	}
}
