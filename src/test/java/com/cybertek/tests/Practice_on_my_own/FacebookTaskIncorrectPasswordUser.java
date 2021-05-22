package com.cybertek.tests.Practice_on_my_own;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTaskIncorrectPasswordUser {
    public static void main(String[] args) {
        /**
         * TC #2: Facebook incorrect login title verification
         * 1.Open Chrome browser
         * 2.Go to https://www.facebook.com
         * 3.Enter incorrect username
         * 4.Enter incorrect password
         * 5.Verify title changed to:
         * Expected: “Log into Facebook”
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // why we maximize? --> to make sure we see all web elements
        driver.get("http://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("asdhk@gmail.comm");
        driver.findElement(By.id("pass")).sendKeys("hdhdhhd" + Keys.ENTER);

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        if (!actualTitle.equals(expectedTitle)) {
            System.out.println("Title Passes");
        } else {
            System.out.println("Title Failed");

        }
    }
}
