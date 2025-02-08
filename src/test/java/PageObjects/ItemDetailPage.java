package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDetailPage extends BasePage{

	WebDriver driver;
	public ItemDetailPage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath="//div[@data-variation-name='Gray']//button[.='Add to cart']") WebElement btn_Cart;
	@FindBy(xpath="//a[.='View cart']") WebElement btn_viewCart;
	//Action
	
	public void btn_AddToKart() {
		btn_Cart.click();
	}
	
	public void btn_ViewCart() {
		btn_viewCart.click();
	}

}
