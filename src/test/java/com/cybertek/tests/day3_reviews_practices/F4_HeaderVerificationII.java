package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_HeaderVerificationII {
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

        WebElement registrationForm = driver.findElement(By.className("_8esh"));

        // 3.Verify “Create a page” link href value contains text:
        // Expected: “registration_form”

        String expectedHeader = "registration_form";
        System.out.println("expectedHeader = " + expectedHeader);
        String actualHeader = registrationForm.getAttribute("href");
        System.out.println("actualHeader = " + actualHeader);

        if (actualHeader.contains(expectedHeader)) {
            System.out.println("Header Ver Passed");
        } else {
            System.out.println("Header Ver Failed");

            driver.quit();
        }
    }
}
