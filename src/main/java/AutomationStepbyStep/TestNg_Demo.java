package AutomationStepbyStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Demo {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
//      WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("118");
		driver = new ChromeDriver(options);

	}

	@Test

	
	public void Googlesearch() {
		driver.get("https://www.google.com/");
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("hello");
		WebElement btn = driver.findElement(By.name("btnK"));
		btn.sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
	
}
