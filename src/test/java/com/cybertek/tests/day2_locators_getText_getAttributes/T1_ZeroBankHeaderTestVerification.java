package com.cybertek.tests.day2_locators_getText_getAttributes;
/**
 * TC #2: Zero Bank header verification
 * 1. Open Chrome browser
 * 2. Go to http://zero.webappsecurity.com/login.html
 * 3. Verify header text
 * Expected: “Log in to ZeroBank”
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTestVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        String expectHeader = "Log in to ZeroBank";

        WebElement actualHeader = driver.findElement(By.tagName("h3"));

        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();

        if (actualHeaderText.equals(expectHeader)) {
            System.out.println("Header verification PASSED");
        } else {
            System.out.println("Header verification Failed");


        }
    }
}
