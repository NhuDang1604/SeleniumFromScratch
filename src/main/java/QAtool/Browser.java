
		package QAtool;

		import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Browser {

			public static void main(String[] args) {
				
				
				String driverExecutablePath = "C:\\eclipse workspace\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverExecutablePath);
				// Create a new instance of the FireFox driver 
				WebDriver driver = new ChromeDriver(); 
				
				// Storing the Application Url in the String variable 
				String url = "https://demoqa.com/browser-windows/"; 
				
				//Launch the ToolsQA WebSite 
				driver.get(url); 



		        // Zoom out (e.g., 80%)
		        zoomOut(driver, 0.8);

		        // Perform other actions on the modified webpage
		        // ...

		        // Wait for a while to observe the result
		        try {
		            Thread.sleep(5000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();
		    }

		    private static void zoomOut(WebDriver driver, double zoomFactor) {
		        // Use JavascriptExecutor to set the zoom level
		        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		        // Execute JavaScript to set the zoom level
		        String script = "document.body.style.zoom='" + zoomFactor + "'";
		        jsExecutor.executeScript(script);
		    }
				

				
			}

		

	


