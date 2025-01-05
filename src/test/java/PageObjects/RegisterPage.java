package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}

	//locators
	
	@FindBy(xpath="//input[@id='Email']") WebElement txt_email;
	@FindBy(xpath="//input[@id='FullName']") WebElement txt_FullName;
	@FindBy(xpath="//input[@id='Password']") WebElement txt_Password;
	@FindBy(xpath="//input[@id='ConfirmPassword']") WebElement txt_cnfmPassword;
	@FindBy(xpath="//button[.='Register']") WebElement btn_register;
	
	
	//Actions
	
	public void email(String email) {
		txt_email.sendKeys(email);
	}
	
	public void fullName(String fn) {
		txt_FullName.sendKeys(fn);
	}
	
	public void Password(String pw) {
		txt_Password.sendKeys(pw);
	}
	
	public void cnfrmPassword(String cpw) {
		txt_cnfmPassword.sendKeys(cpw);
	}
	
	public void register() {
		btn_register.click();
	}
}
