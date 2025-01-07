package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	WebDriver driver;
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	//locators
	
	@FindBy(xpath="//h5[.='Esprit Ruffle Shirt']") WebElement img_shirt;
	
	public String item() {
		String text=img_shirt.getText();
		return text;
	}
}
