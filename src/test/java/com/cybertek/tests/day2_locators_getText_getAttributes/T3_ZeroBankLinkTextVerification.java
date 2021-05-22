package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC #2: Zero Bank link text verification
 * 1. Open Chrome browser
 * 2. Go to http://zero.webappsecurity.com/login.html 3. Verify link text from top left:
 * Expected: “Zero Bank”
 * 4. Verify link href attribute value contains:
 * Expected: “index.html”
 */

public class T3_ZeroBankLinkTextVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Link verification PASSED");
        } else {
            System.out.println("Link verification FAILED");


            }
        String expectedInHrefValue = "index.html";
        String actualInHrefValue = zeroBankLink.getAttribute("href");
        System.out.println("actualInHrefValue = " + actualInHrefValue);

        if (actualInHrefValue.contains(expectedInHrefValue)) {
            System.out.println("HREF attribute value verification PASSED!");
        } else {
            System.out.println("HREF attribute value verification FAILED!");

        }
    }
}
