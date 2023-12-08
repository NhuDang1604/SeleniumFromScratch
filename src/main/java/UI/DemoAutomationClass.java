package UI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class DemoAutomationClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse workspace\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://ww.google.com");
		System.out.println("no error");
	}

}
