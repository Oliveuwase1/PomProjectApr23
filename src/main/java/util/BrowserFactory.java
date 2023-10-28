package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	 static WebDriver driver;
	
	public static WebDriver  init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	    driver.get("https://www.techfios.com/billing/?ng=admin/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		By USERNAME_FIELD = By.xpath("//*[@id=\"username\"]");
        driver.findElement(USERNAME_FIELD).sendKeys("dkaflkjdsflk");
		return driver;
	
	
	}
	
	public static void tearDown() {
		
	driver.close();
	driver.quit();	
		
	}
	
	
	
	
}
