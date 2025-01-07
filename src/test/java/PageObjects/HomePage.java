package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage  {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	
	@FindBy(xpath="//a[.='Register']") WebElement btn_register;
	@FindBy(xpath="//a[.='Log in']") WebElement btn_login;
	@FindBy(xpath="//input[@id='Query']") WebElement txt_search;
	@FindBy(xpath="//form[@class='form-inline']//button") WebElement btn_search;
	
	
	//Actions
	
	public void Register() {
		btn_register.click();
	}

	public void Login() {
		btn_login.click();
	}
	
	public void Search(String text) {
		txt_search.sendKeys(text);
	}
	
	public void search_btn() {
		btn_search.click();
	}

}
