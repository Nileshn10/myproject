package FirstPkg;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testclass {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriverpath\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://google.com");
		//driver.navigate().wait(5);
		driver.navigate().to("https://youtube.com");
		//driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.manage().window().minimize();
		driver.manage().window().setPosition(new Point(-2000, 0));
		driver.manage().window().maximize();
		
		
		
	}

}
