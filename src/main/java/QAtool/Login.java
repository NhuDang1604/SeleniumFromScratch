package QAtool;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("118");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		System.out.println("getbrowsersuccess");

		WebElement userName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		userName.sendKeys("testuser");
		passWord.sendKeys("Password@123");
		
		btnLogin.click();
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
		try {
			  WebElement btnLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='books-wrapper']//button[@id='submit']")));//class="profile-wrapper", 

			if (btnLogout.isDisplayed())
				
			{
				//btnLogout.click();
				System.out.println("Logout successfully!");
			}
		} catch (Exception e) {
			System.out.println("Incorrect login....");
		}
	}
}


	


