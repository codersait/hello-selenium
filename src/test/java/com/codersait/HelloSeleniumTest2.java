package com.codersait;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloSeleniumTest2 {
    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();
    }
    
    @Test
    public void smartTest(){
        WebDriver driver = new SafariDriver();
        driver.get("https://www.saucedemo.com");
    
        // driver.quit();
    }
}
