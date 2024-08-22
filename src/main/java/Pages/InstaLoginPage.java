package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaLoginPage {
	
	WebDriver driver;
	
	public InstaLoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	// defining element of username
	@FindBy(xpath = "//input[@name='username']")
	private WebElement instaUsername;
	
	
	// defining element of password
	@FindBy(name = "password")
	private WebElement instaPassword;
	
	// defining element of login button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement instaLoginBtn;

	public WebElement getInstaUsername() {
		return instaUsername;
	}

	public WebElement getInstaPassword() {
		return instaPassword;
	}

	public WebElement getInstaLoginBtn() {
		return instaLoginBtn;
	}
		


}
