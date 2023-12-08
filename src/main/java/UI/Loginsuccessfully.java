package UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Loginsuccessfully {

	public static void main(String[] args) {
		
		//*browser set up based on C:// path location of chromedriver
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\eclipse workspace\\chromedriver.exe");
		
		//browser set up automatically
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("118");
		ChromeDriver driver = new ChromeDriver(options);
		//
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement btn = driver.findElement(By.id("login-button"));
		btn.click();
	}

}
