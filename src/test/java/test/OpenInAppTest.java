package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.InstaLoginPage;
import Pages.LogIn;
import Pages.SecretLinkGenarate;
import Pages.instaProfile;
import generic.OpenInAppBrowseropen;

public class OpenInAppTest extends OpenInAppBrowseropen{

	private LogIn login;
	private SecretLinkGenarate secretLink;
	private InstaLoginPage instalogin;
	private instaProfile instaprofile;
	private String copyLink;
	private List<String> storedLinks;
	
	
	
	@Test(priority = 0, enabled = true)
	public void loginTest() throws InterruptedException {
		
		login = new LogIn(driver);
	    secretLink = new SecretLinkGenarate(driver);	
		
		login.getLogin().click();
		Thread.sleep(2000);
		
		login.getContinue_with_Google().click();
		Thread.sleep(2000);
		
		login.getEnter_email().sendKeys(userEmail);
		Thread.sleep(2000);
		
		login.getNext_btn().click();
		Thread.sleep(5000);
		
		login.getEnter_password().sendKeys(password);
		Thread.sleep(2000);
		
		login.getClick_next().click();
		Thread.sleep(4000);
		
//		login.getContinue_btn().click();
//		Thread.sleep(2000);
	
	}
	
	@Test(priority = 1, enabled = true)
	public void linkGenarate() throws InterruptedException {
		
		//loginTest();
		//Thread.sleep(2000);
		// create a array and Store 4 links
//		String[] mylinks = {"https://www.flipkart.com/", "www.redemday2.com", "www.happyredeam42.com", "www.collectgold.shop"};
		String[] mylinks = {"https://www.flipkart.com/", "www.redemday2.com"};
		
		// create a array and store 4 title 
		String[] mytitle = {"Secret", "Quick-Redeem", "my-secret", "qaAssurance-Secrect"};
		
		
		
		// create a loop run this loop 4 times because we need to generate 4 links
		for(int i = 0; i < mylinks.length; i++) {

			String link = mylinks[i];
			String title = mytitle[i];

			// Scroll to the "Top Secret Links" element after logging in
			secretLink.scrollToElement(secretLink.getTop_secret_link());
			Thread.sleep(2000);

			//		secretLink.getStart_Earning_Now().click();
			//		Thread.sleep(2000);

			secretLink.getSecret_link().click();
			Thread.sleep(2000);

			secretLink.getSelect_value().click();
			Thread.sleep(2000);

			secretLink.getClick_on_continue().click();
			Thread.sleep(2000);

			secretLink.getClick_link().click();
			Thread.sleep(2000);

			secretLink.getAgain_continue().click();
			Thread.sleep(2000);
			
			
//			secretLink.getEnter_link().sendKeys("https://www.flipkart.com/");
			secretLink.getEnter_link().sendKeys(link);
			Thread.sleep(2000);

			secretLink.getFinal_coninue().click();
			Thread.sleep(2000);

//			secretLink.getContent_title().sendKeys("flipkartpage");
			secretLink.getContent_title().sendKeys(title);
			Thread.sleep(2000);

			secretLink.getPreview().click();
			Thread.sleep(2000);

			secretLink.getPublish().click();
			Thread.sleep(2000);

			secretLink.getYes_publish().click();
			Thread.sleep(4000);

			secretLink.getClose_link_btn().click();
			Thread.sleep(4000);
			
			

		}
		
		storedLinks = secretLink.copyLink();
	}
	
	@Test(priority = 2)
	public void instagramLogin() throws InterruptedException {
		
		instalogin = new InstaLoginPage(driver);
		
		
		((JavascriptExecutor) driver).executeScript("window.open('https://www.instagram.com/', '_blank');");
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		
		instalogin.getInstaUsername().sendKeys(instausername);
		
		instalogin.getInstaPassword().sendKeys(instapassword);
		
		instalogin.getInstaLoginBtn().click();		
		
		
	}
	
	@Test(priority = 3)
	public void addLinksBio() throws InterruptedException {
		
		instaprofile = new instaProfile(driver);
		Thread.sleep(2000);
		instaprofile.getNotNowBtn().click();
		instaprofile.getNotNowBtn2().click();
		Thread.sleep(2000);
		instaprofile.getMyProfile().click();
		instaprofile.getEditProfileBtn().click();
//		instaprofile.getBioArea().sendKeys("This my bio");
		
		for(String link : storedLinks) {
			instaprofile.getBioArea().sendKeys(link);
			instaprofile.getBioArea().sendKeys("\n");			
		}
		
	}
	
}
