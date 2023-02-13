package SwitchingWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitcWindowww {
	public void add() {
	
	
		//System.setProperty("webdriver.chrome.driver","path of local machine");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit. SECONDS);
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parent= driver.getWindowHandle();
		driver.findElement(By.xpath("(//a['text()=New Browser Tab Link'])[80]")).click();
		Set<String>child=driver.getWindowHandles();
		for(String allwin:child) {
			if(driver.getTitle().contains("NxtGen A.I Academy – A"));
			driver.switchTo().window(allwin);
			driver.findElement(By.xpath("(//*[text()='Python for Automation'])[2]")).click();
		
		
	
		driver.quit();
		}
	}
}
	
		
		


