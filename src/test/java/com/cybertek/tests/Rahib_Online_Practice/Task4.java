package com.cybertek.tests.Rahib_Online_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {

        //Test Case NO=4
        //
        //CarGurus - Suleyman Gets His Baby Back - with Select Class + ArrayList,
        // For Loop and String Manipulation
        //
        //  KILL THE xPath - Find it All With CUSTOM xPath(s)!!!
        //  Do not lie to YOURSELF by Using Google Tools 🙂
        //
        //
        //1. SetUp WebDriver and get "https://www.cargurus.com/"
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.cargurus.com/");
        //
        //2. Maximize the window
        driver.manage().window().maximize();
        //
        //3. Give 3 seconds break to the DRIVER - do NOT use Thread.sleep
        Thread.sleep(3000);
        //
        //4. Click on Make/Model and Select BMW
        WebElement makeModelLink = driver.findElement(By.xpath("//*[@id=\"usedSearch\"]/label[1]/span"));
        makeModelLink.click();

        //
        //5. Click on Body Style and Select M6
        driver.findElement(By.xpath("//*[@id=\"carPickerUsed_modelSelect\"]"));

        //
        //6. Click on Zip area and send your local ZIPCODE + Click Search
        //
        //7. On the following page click on the FROM Year
        // (which is the first on the left) and choose 2013
        //
        //8. Click on the TO year - which is the one on the right and choose 2019
        //
        //9. Click Search
        //
        //10. Hold WebDriver for 3 seconds to help the search results
        // page to fully load (do NOT use Thread.sleep)
        //
        //11. On the Search result page inspect the whole html of the page,
        // collect all the links and set up a condition to seperate the car related links from the
        //
        //other links. PRINT: The numbers of ALL links and the links with
        // only Car in TWO seperate Print Statements. ONCE AGAIN - We are Printing ONLY AND ONLY the
        //
        //NUMBERS of - meaning how many links in Total and how many of that total are car related 😉
    }
}
