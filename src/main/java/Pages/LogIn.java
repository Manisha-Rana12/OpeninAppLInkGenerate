package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {

	// ----------- WebDriver instance for interacting with the browser
		WebDriver driver;
		 
		// ----------- Constructor to initialize the WebDriver instance and PageFactory
		public LogIn(WebDriver driver) {
			
			this.driver = driver;
			// ----------- Initialize the PageFactory elements
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "(//span[@class='bg-primary cursor-pointer rounded-full py-2 px-5 text-white font-ftSemibold text-xs'])[2]")
		private WebElement login;
		
		@FindBy(xpath ="//*[text()='Continue with Google']")
		private WebElement Continue_with_Google;
		
		@FindBy(xpath = "//input[@type='email']")
		private WebElement enter_email;
		
		@FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")
		private WebElement next_btn;
		
		@FindBy(xpath = "//input[@type='password']")
		private WebElement enter_password;

		@FindBy(xpath = "//*[text()='Next']")
		private WebElement click_next
		;
		public WebElement getClick_next() {
			return click_next;
		}

		@FindBy(xpath = "//*[text()='Continue']")
		private WebElement continue_btn;
		
		public WebElement getContinue_btn() {
			return continue_btn;
		}

		public WebElement getNext_btn() {
			return next_btn;
		}

		public WebElement getEnter_password() {
			return enter_password;
		}

		public WebElement getEnter_email() {
			return enter_email;
		}

		public WebElement getLogin() {
			return login;
		}

		public WebElement getContinue_with_Google() {
			return Continue_with_Google;
		}
	
}
