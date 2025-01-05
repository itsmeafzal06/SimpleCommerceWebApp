package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//locators
	@FindBy(xpath="//input[@id='Email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='Password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='RememberMe']") WebElement rd_btn_rem;
	@FindBy(xpath="//button[.='Log in']") WebElement btn_Login;
	
	
	//actions
	
	public void email(String em) {
		txt_email.sendKeys(em);
	}
	
	public void password(String pw) {
		txt_password.sendKeys(pw);
	}
	
	public void radio_btn() {
		rd_btn_rem.click();
	}
	
	public void btn_login() {
		btn_Login.click();
	}
}
