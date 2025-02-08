package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddPage extends BasePage {

	WebDriver driver;
	public ShippingAddPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='NewAddressForm_ContactName']") WebElement txt_cntName;
	@FindBy(xpath="//select[@id='NewAddressForm_CountryId']") WebElement dd_country;
	@FindBy(xpath="//select[@id='NewAddressForm_StateOrProvinceId']") WebElement dd_State;
	@FindBy(xpath="//select[@id='NewAddressForm_DistrictId']") WebElement dd_district;
	@FindBy(xpath="//input[@id='NewAddressForm_City']") WebElement txt_city;
	@FindBy(xpath="//input[@id='NewAddressForm_ZipCode']") WebElement txt_postalcode;
	@FindBy(xpath="//input[@id='NewAddressForm_AddressLine1']") WebElement txt_add;
	@FindBy(xpath="//input[@id='NewAddressForm_Phone']") WebElement txt_num;
	@FindBy(xpath="//button[.='Payment']") WebElement btn_ptm;
	//@FindBy(xpath="") WebElement
	
	//Actions
	
	public void txt_Name(String n) {
		txt_cntName.sendKeys(n);
	}
	
	public void drpdwn_Country(String n) {
		Select st= new Select(dd_country);
		st.selectByVisibleText(n);
	}
	
	public void drpdwn_State(String n) {
		Select st= new Select(dd_State);
		st.selectByVisibleText(n);
	}
	
	public void drpdwn_District(String n) {
		Select st= new Select(dd_district);
		st.selectByVisibleText(n);
	}
	
	public void txt_city(String n) {
		txt_city.sendKeys(n);
	}
	
	public void txt_PostalCode(String n) {
		txt_postalcode.sendKeys(n);
	}
	
	public void txt_Address(String n) {
		txt_add.sendKeys(n);
	}
	
	public void txt_Number(String n) {
		txt_num.sendKeys(n);
	}
	
	public void btn_Payment() {
		btn_ptm.click();
	}
	
	
	
}
