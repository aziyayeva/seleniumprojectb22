package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1 - Setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2 - create instance of selenium web driver
        WebDriver driver = new ChromeDriver(); // opens completely empty wed browser page.

        //this line will basically maximize the browser size
        driver.manage().window().maximize();
        driver.manage().window().fullscreen(); // only for MAC users only

        // 3 - get the page for Tesla.com
        driver.get("http://www.tesla.com");

        // putting 3 seconds of wait / stops the code for 3 seconds
        Thread.sleep(3000);

        System.out.println("Current title: " + driver.getTitle());

        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        // Going back using navigations
        driver.navigate().back();
        Thread.sleep(3000);

        //Going forward using navigations
        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();

        //going to another url using .to() method
        driver.navigate().to("http://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentURL);

        //this will close the currently opened browser
        //it will only close 1 browser or 1 tab
        driver.close();

        //driver.quit();









    }
}
