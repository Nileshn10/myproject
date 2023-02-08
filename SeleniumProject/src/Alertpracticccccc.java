import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpracticccccc {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		 String parent=driver.getWindowHandle();
		 Thread.sleep(20000);
		 driver.findElement(By.xpath("//*[text()='New Browser Window']")).click();
		 Set<String>child=driver.getWindowHandles();
		 for(String allwin:child) {
			 driver.switchTo().window(allwin);
			 if(driver.getTitle().contains("NxtGen A.I Academy – Automate Intelligently"));
			 driver.manage().window().maximize();
			 driver.findElement(By.linkText("Python for Automation")).click();
		 }
		 
		

	}

}
