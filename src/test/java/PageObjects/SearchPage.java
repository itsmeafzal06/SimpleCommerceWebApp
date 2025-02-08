package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class SearchPage extends BasePage {

	WebDriver driver;
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	//locators
	
	@FindBy(xpath="//h5[.='iPhone 6s 16GB toto']") WebElement img_itemT;
	@FindBy(xpath="//img[@alt='iPhone 6s 16GB toto']") WebElement img_itemC;
	
	//Actions
	
	public String itemT() {
		String text=img_itemT.getText();
		return text;
	}
	
	public void itemC() {
		img_itemC.click();
	}
}
