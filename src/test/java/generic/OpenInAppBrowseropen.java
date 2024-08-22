package generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenInAppBrowseropen {

	// WebDriver instance
	
	protected WebDriver driver;
	
	// Properties for user credentials and URLs
	
	protected String userEmail;
	protected String password;
	protected String instaUrl;
	protected String instausername;
	protected String instapassword;
	
	@BeforeClass
	public void setUp() throws IOException {
		// Load properties from the specified file
		
		Properties pro = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Manisha\\OneDrive\\Documents\\Second-workspace\\OpenInAppLinkGenarate\\src\\test\\resources\\config.properties");
		
		pro.load(fis);
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(pro.getProperty("OpenInAppURL"));		
		
        userEmail = pro.getProperty("userEmail");
        
        password = pro.getProperty("password");
        
        instaUrl = pro.getProperty("instaUrl");
        
        instausername = pro.getProperty("instausername");
        
        instapassword = pro.getProperty("instapassword");
	}
	
	@AfterClass
	public void teardown() {
			
		 //driver.quit();
	}
}
