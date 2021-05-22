package com.cybertek.tests.Rahib_Online_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {

        //Test Case NO=2
        //
        //WARM UP:
        //
        //YouTube Song Search and Play
        //
        //
        //1. Use WebDriverFactory method to call the Google Chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //
        //2. Command Chrome Browser to open YouTube.com
        driver.get("https://www.youtube.com/");
        //
        //3. Maximize the screen
        driver.manage().window().maximize();
        //
        //4. Locate YouTube search bar By xPath

        //
        //5. Create a WebElement from the located Search Bar xPath
        WebElement search = driver.findElement(By.xpath("//input[@id = 'search']"));
        search.sendKeys("Blue - One Love");
        search.submit();

      //  WebElement videoClip = driver.findElement(By.xpath());

        //
        //6. Reuse the created WebElement to send search content into the serach bar and send "Blue - One Love" to the search bar
        //Put the whole thread to Sleep for 3 seconds
        //
        //7. Resuse the created WebElement and SUBMIT the search
        //Put the whole thread to Sleep for 3 seconds
        //
        //8. Click on the first Music video named: Blue - One Love (Official Music Video) (FEEL FREE TO USE WHATEVER LOCATER YOU WANT - JUST CLICK ON THAT VIDEO)
        //
        //then...
        //
        //Disregard add rolls - / SKipIt - and enjoy some good oldschool song 😉


    }
}
