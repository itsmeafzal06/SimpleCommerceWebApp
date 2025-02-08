package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends BasePage{

	WebDriver driver;
	public ConfirmationPage(WebDriver driver) {
		super(driver);
	}

	//locators
	
	@FindBy(xpath="//h2[.='Congratulation!']") WebElement txt_cong;
	
	//Actions
	
	public String txt_Cong() {
		String text= txt_cong.getText();
		return text;
	}
}
