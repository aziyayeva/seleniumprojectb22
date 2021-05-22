package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC #3: Back and forth navigation
 * 1- Open a chrome browser
 * 2- Go to: https://google.com
 * 3- Click to Gmail from top right.
 * 4- Verify title contains:
 * Expected: Gmail
 * 5- Go back to Google by using the .back();
 * 6- Verify title equals:
 * Expected: Google
 */

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification PASSED!");
        } else {

            System.out.println("Title verification FAILED!");
        }

        driver.navigate().back();

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("Title verification PASSED");

        } else {

            System.out.println("Title verification Failed");

        }
    }
}
