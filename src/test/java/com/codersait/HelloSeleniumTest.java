package com.codersait;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HelloSeleniumTest {

    @Test
    public void firstTest() throws InterruptedException{
        // System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        WebDriver driver = new SafariDriver();
        driver.get("https://saucedemo.com");
        Thread.sleep(3000);
        driver.quit();      
    }
}
