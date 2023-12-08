package QAtool;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class X {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setBrowserVersion("118");

        //options.addExtensions(new File("C:\\Users\\nhu.ddq\\Downloads\\AdBlock — best ad blocker 5.14.0.0.crx"));

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();

        // Zoom out (e.g., 80%)
        zoomOut(driver, 0.8);

        hideElementById(driver, "adplus-anchor");

        System.out.println("getbrowsersuccess");

        WebElement firstName = driver.findElement(By.xpath("//div[@id='userName-wrapper']//input[@id='firstName']"));
        firstName.sendKeys("nhu");

        WebElement lastName = driver.findElement(By.xpath("//div[@id='userName-wrapper']//input[@id='lastName']"));
        lastName.sendKeys("dang");

        WebElement userEmail = driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//input[@id='userEmail']"));
        userEmail.sendKeys("nhudang@gmail.com");

        WebElement genderRadiobutton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
        genderRadiobutton.click();

        WebElement datepicker_input = driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]"));
        datepicker_input.click();

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
        phoneNumber.sendKeys("0000976443");

        WebElement ddown = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
        Select slct = new Select(ddown);
        slct.selectByIndex(10);
        System.out.println(ddown.getText());

        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // WebElement datePicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'010')]")));
        // datePicker.click();
        // sleep(1000);

        WebElement sbjct = driver.findElement(By.id("subjectsContainer"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].value = 'GEO';", sbjct);

        WebElement checkbox = driver.findElement(By.id("hobbies-checkbox-2"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkbox);

        WebElement uploadImage = driver.findElement(By.id("uploadPicture"));
        uploadImage.sendKeys("D://CLV memories//1696426223319.JPEG");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].value = 'CongHoa, SG';", currentAddress);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement StateandCity = driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[@class=' css-2b097c-container']"));
        JavascriptExecutor executor21 = (JavascriptExecutor) driver;
        executor21.executeScript("arguments[0].value = 'NCP';", StateandCity);
        StateandCity.sendKeys(Keys.ENTER);
    }

    private static void zoomOut(WebDriver driver, double zoomFactor) {
        // Use JavascriptExecutor to set the zoom level
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to set the zoom level
        String script = "document.body.style.zoom='" + zoomFactor + "'";
        jsExecutor.executeScript(script);
    }

    private static void hideElementById(WebDriver driver, String elementId) {
        // Use JavaScript to hide or remove the element with the specified ID
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        // Execute JavaScript to hide or remove the element by ID
        String script = "var element = document.getElementById('" + elementId + "');" +
                "if (element) { element.style.display = 'none'; }";
        jsExecutor.executeScript(script);
    }

    private static void sleep(int i) {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
