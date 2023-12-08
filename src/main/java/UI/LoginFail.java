package UI;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginFail {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("118");
		ChromeDriver driver = new ChromeDriver(options);
		
        driver.get("https://www.saucedemo.com/");
        // Find the username and password input fields and the login button
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        // Enter invalid credentials
        usernameField.sendKeys("cx");
        passwordField.sendKeys("mn");
        // Click the login button
        loginButton.click();       
        // Use WebDriverWait to wait for the error message to be visible
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));     
//        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]")));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login_button_container > div > form > div.error-message-container.error")));
        // Verify that the login was unsuccessful
        if (errorMessage.isDisplayed()) {
            System.out.println("Login unsuccessful. Error message: " + errorMessage.getText());
        } else {
            System.out.println("Login successful. Test failed!");
        }
        // Close the browser
        driver.quit();
    }
}
