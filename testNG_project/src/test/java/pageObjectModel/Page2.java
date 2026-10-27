package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testCases.Base;

public class Page2 extends Base{
	
	@FindBy(css = "") WebElement gender;
	
	@FindBy(css = "") WebElement first_name;
	
	@FindBy(css = "") WebElement last_name;
	
	@FindBy(css = "") WebElement password;
	
	@FindBy(css = "") WebElement days;
	
	@FindBy(css = "") WebElement Month;
	
	@FindBy(css = "") WebElement year;
	
	@FindBy(css = "") WebElement register;


public Page2(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	
}

//action perform

public void personal_info() {
	
	gender.click();
	first_name.sendKeys("");
	last_name.sendKeys("");
	password.sendKeys("");
	
	Select s = new Select(days);
	s.deselectByValue("");
	
	Select s1 = new Select(Month);
	s1.selectByValue("");
	
	Select s2 = new Select(year);
	s2.selectByValue("");
	register.click();
}


}
