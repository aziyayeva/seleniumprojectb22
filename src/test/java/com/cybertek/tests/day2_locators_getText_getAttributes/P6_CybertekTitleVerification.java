package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC #6: Practice Cybertek – Class locator practice
 * 1. Open Chrome browser
 * 2. Go to http://practice.cybertekschool.com/inputs
 * 3. Click “Home” button
 * 4. Verify title as expected:
 * Expected: Practice
 */

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");

        Thread.sleep(3000);
        driver.findElement(By.className("nav-link")).click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED");
        } else {
            System.out.println("Title verification is FAILED");


        }
    }
}
