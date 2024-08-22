package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instaProfile {
	
	WebDriver driver;
	 
	// ----------- Constructor to initialize the WebDriver instance and PageFactory
	public instaProfile(WebDriver driver) {
		
		this.driver = driver;
		// ----------- Initialize the PageFactory elements
		PageFactory.initElements(driver, this);
	}
	
	//
	@FindBy(xpath = "//*[text()=\"Profile\"]")
	private WebElement myProfile;
	
	@FindBy(linkText = "Edit profile")
	private WebElement editProfileBtn;
	
	@FindBy(id = "pepBio")
	private WebElement bioArea;
	
	@FindBy(xpath = "//*[text()=\"Not now\"]")
	private WebElement notNowBtn;
	
	@FindBy(xpath = "//button[@class=\"_a9-- _ap36 _a9_1\"]")
	private WebElement notNowBtn2;

	

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getEditProfileBtn() {
		return editProfileBtn;
	}


	public WebElement getBioArea() {
		return bioArea;
	}

	public WebElement getNotNowBtn() {
		return notNowBtn;
	}

	public WebElement getNotNowBtn2() {
		return notNowBtn2;
	}
	
	
	

}
