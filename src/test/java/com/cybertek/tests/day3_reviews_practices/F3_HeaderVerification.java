package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {

        //TC #3: Facebook header verification
        // 1.Open Chrome browser

        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance or Object and open browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //locate the WedElement
        WebElement headerText = driver.findElement(By.className("_8eso"));

        // 3.Verify header text is as expected:
        // Expected: “Connect with friends and the world around you on Facebook.”

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = headerText.getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Header Passed");
        } else {
            System.out.println("Header Failed");



        }
    }
}
