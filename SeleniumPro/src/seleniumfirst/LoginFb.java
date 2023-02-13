package seleniumfirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFb {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		String text=driver.getTitle();
		Assert.assertEquals(text, text);
		System.out.println(text);
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Nilesh");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Kokate");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("7722085632");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Elin@1010");
	    WebElement dayn=driver.findElement( By.id("day"));
	    WebElement month=driver.findElement( By.id("month"));
	    WebElement year=driver.findElement( By.id("year"));
	    Select s= new Select(dayn);
	    s.selectByIndex(19);
	    Select m= new Select(month);
	    m.selectByIndex(5);
	    Select y= new Select(year);
	    y.selectByValue("1990");
	    driver.navigate().refresh();
	    driver.navigate().to("https://youtube.com");
	
	    
		
		driver.quit();
		
	}

}
