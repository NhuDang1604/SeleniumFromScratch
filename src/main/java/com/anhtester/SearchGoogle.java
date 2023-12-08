package com.anhtester;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchGoogle extends BaseTest {
//@BeforeTest
public static void main(String[] args) {
//
//    ChromeOptions options = new ChromeOptions();
//    options.setBrowserVersion("118");
//    driver = new ChromeDriver(options);
//    driver.get("http://ww.google.com");

}
    
    public void testSearchKeywordOnGoogle01() {
        driver.get("https://google.com");
        WebUI.waitForPageLoaded();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("học auto test", Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(),'Lộ trình học để trở thành Automation Tester')]")).click();
        WebUI.waitForPageLoaded();
        sleep(3);
        WebUI.pressDownKey(5);
        Assert.assertEquals(driver.getTitle(), "Lộ trình học để trở thành Automation Tester | Anh Tester");
    }

   
    public void testSearchKeywordOnGoogle02() {
        driver.get("https://google.com");
        WebUI.waitForPageLoaded();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium là gì", Keys.ENTER);
        WebUI.waitForPageLoaded();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//textarea[@name='q']")));
        driver.findElement(By.xpath("//a[contains(@href,'https://anhtester.com')]//h3")).click();
        WebUI.waitForPageLoaded();
        sleep(3);
        WebUI.pressDownKey(5);
        Assert.assertEquals(driver.getTitle(), "Giới thiệu về Selenium | Anh Tester");
    }
}
