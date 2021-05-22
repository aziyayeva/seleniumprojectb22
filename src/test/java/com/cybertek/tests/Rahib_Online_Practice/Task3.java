package com.cybertek.tests.Rahib_Online_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        //Test Case NO=3
        //
        //Feel the breeze 😉
        //
        //Yahoo Email Login
        //
        //
        //1. SetUp The chrome Driver Calling WebDriver Manager / Bonigarcia Dependencies (Not the Method)
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //
        //2. Access the Yahoo Email Login page with this
        // link: "https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd"
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
        //

        //3. Make the browser screen => fullscreen
        driver.manage().window().maximize();
        //
        //4. Check the title of the Yahoo page with an IF statement
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Yahoo";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Passe");
        } else
        System.out.println("Title Passe");

        //
        //5. Locate the username space By ID
        WebElement username = driver.findElement(By.xpath("//input[@id='login-username']"));
        username.sendKeys("batch22@yahoo.com");
        username.click();

        Thread.sleep(3000);
        //
        //6. Send the username credentials to the located username space. Use "batch22@yahoo.com" -
        // as username
        //Put the whole thread to Sleep for 3 seconds
        //
        //7. Click NEXT to go to the next (Password insert space)
        WebElement signInButton = driver.findElement(By.xpath("//input[@id='login-signin']"));

        WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
        Thread.sleep(3000);
        password.sendKeys("Feb21@2021" + Keys.ENTER);



        //
        //8. Locate the password space By ID
        //Put the whole thread to Sleep for 3 seconds
        //
        //9. Send the password credentials to the located password space. Use "Feb21@2021" - as password
        //
        //10 Click LOGIN button
        //Put the whole thread to Sleep for 3 seconds
        //
        //11. Checking the new title Put a new IF condition Stating "Login Successful"
        // as true - "Failed to Login" as false of your last IF condition.
        // Note that still comparin actual and expected title


    }
}
