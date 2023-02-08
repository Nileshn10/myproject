package FirstPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {
	WebDriver driver;
	
	@BeforeTest
	public void url() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();		
	}
	


	@AfterTest
	public void launch() {
	driver.quit();
	
	}
	
	
	@AfterClass
	public void quit() {
		driver.get("https://youtube.com");
	
		
	
		
	}
	@Test
	public void test1() {
		driver.get("https://yohoo.com");
	}

}
