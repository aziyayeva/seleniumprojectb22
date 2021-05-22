package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC #2: Cybertek practice tool verifications
 * 1. Open Chrome browser
 * 2. Go to http://practice.cybertekschool.com
 * 3. Verify URL contains
 * Expected: cybertekschool
 * 4. Verify title:
 *  Expected: Practice
 */

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)) {
            System.out.println("URL Verification Passed!");
        } else {
            System.out.println("URL verification FAILED! ");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification PASSED!");
        } else {
            System.out.println("Title Verification Failed!");
        }


    }
}
