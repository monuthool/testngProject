package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.Base;

public class Page1 extends Base{
	
	
	//repository
	
	@FindBy(css = "input#username") WebElement Username;
	
	@FindBy(css = "input#password") WebElement Password;

	@FindBy(css = "button#submit") WebElement Submit;
	
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//we need to perform the action
	
	public void account_verify() {
		Submit.click();
		
		scrol1("window.scrollBy(0,400)");
		
		Username.sendKeys("student");
		
		Password.click();

	}


}
