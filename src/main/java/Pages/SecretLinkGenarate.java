package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecretLinkGenarate {

	WebDriver driver;
	
	public SecretLinkGenarate(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[text()='Top Secret Links']")
	private WebElement top_secret_link;
	
	

	public WebDriver getDriver() {
		return driver;
	}
	@FindBy(xpath = "//*[text()='Start Earning Now']")
	private WebElement Start_Earning_Now;
	
	@FindBy(xpath = "(//*[text()='Secret Links'])[1]")
	private WebElement secret_link;
	
	
	@FindBy(xpath = "//button[@value='25']")
	private WebElement select_value;
	
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement click_on_continue;
	
	@FindBy(xpath = "//button[@value='Link']")
	private WebElement click_link;
	
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement again_continue;
	
	@FindBy(xpath = "//input[@placeholder='Enter the Link']")
	private WebElement enter_link;
	
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement final_coninue;
	
	@FindBy(xpath = "//input[@placeholder='Content Title']")
	private WebElement content_title;

	@FindBy(xpath = "//*[text()='Preview']")
	private WebElement preview;
	
	@FindBy(xpath = "(//*[text()='Publish'])[1]")
	private WebElement publish;
	
	@FindBy(xpath = "//*[text()='Yes, Publish']")
	private WebElement yes_publish;

	@FindBy(xpath = "//img[@class=\"p-2 border rounded-md\"]")
	private WebElement close_link_btn;
	
	
	@FindBy(xpath = "//div[@class=\"flex flex-col items-center justify-between \"]/div[2]/div/div/p")
	private List<WebElement> copyLinks;
	

	

	// Method to scroll to a specific WebElement
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void performSomeAction() {
        
        // Alternatively, scroll to a specific element
        scrollToElement(top_secret_link);
    }

    public WebElement getTop_secret_link() {
		return top_secret_link;
	}

	public void setTop_secret_link(WebElement top_secret_link) {
		this.top_secret_link = top_secret_link;
	}
	
	public WebElement getSecret_link() {
		return secret_link;
	}
	
	public WebElement getStart_Earning_Now() {
		return Start_Earning_Now;
	}

	public WebElement getSelect_value() {
		return select_value;
	}

	public WebElement getClick_on_continue() {
		return click_on_continue;
	}

	public WebElement getClick_link() {
		return click_link;
	}

	public WebElement getAgain_continue() {
		return again_continue;
	}

	public WebElement getEnter_link() {
		return enter_link;
	}

	public WebElement getFinal_coninue() {
		return final_coninue;
	}

	public WebElement getContent_title() {
		return content_title;
	}

	public WebElement getPreview() {
		return preview;
	}

	public WebElement getPublish() {
		return publish;
	}
	
	public WebElement getYes_publish() {
		return yes_publish;
	}
	
	public WebElement getClose_link_btn() {
		return close_link_btn;
	}

	
	
	public List<WebElement> getCopyLink() {
		return copyLinks;
	}

	public List<String> copyLink() {
		
		List<String> cpLinks= new ArrayList<>();
		
		// {"Secret", "Quick-Redeem", "my-secret", "qaAssurance-Secrect"}
		
		for(WebElement copyLink1 : copyLinks) {
			
			if(copyLink1.getText().contains("Secret") || copyLink1.getText().contains("Qmy-secret") || copyLink1.getText().contains("Quick-Redeem") || copyLink1.getText().contains("qaAssurance-Secrect")) {
				
				System.out.println(copyLink1);
				cpLinks.add(copyLink1.getText());
				
			}
		}
		
		return cpLinks;
	}
}
