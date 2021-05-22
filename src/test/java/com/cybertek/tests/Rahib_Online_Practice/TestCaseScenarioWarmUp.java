package com.cybertek.tests.Rahib_Online_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCaseScenarioWarmUp {
    public static void main(String[] args) throws InterruptedException {

        //TEST CASE:
        //
        //- access to the login page
        //- check if you are on the expected login page
        //- correct username and password
        //- access to the dashboard
        //- check the title after login - if correct with the expected
        //- check if the login title is NOT the same as the Dashboard Title. If not - Passed
        // - https://qa3.vytrack.com/user/login
        //Username: Storemanager201     Password: UserUser123

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/user/login");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login";

        String check = actualTitle.equals(expectedTitle) ? "Passed: Actual title matches expected" : "Failed: Actual Title is NOT matching";
        System.out.println(check);
       // System.out.println(driver.getTitle()); -- actual title on the web..

        WebElement userNameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        userNameLoginPage.sendKeys("Storemanager201");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        password.submit();

        Thread.sleep(5000);
        String actualTitle2 = driver.getTitle();
        System.out.println(actualTitle2);
        String expectedTitle2 = "Dashboard";

        // if they do not match !actualTitle2.equals(expectedTitle) ?
        Thread.sleep(5000);
        String check2 = !actualTitle2.equals(expectedTitle) ? "Title Passed" : "Title Failed";
        System.out.println(check2);

        Thread.sleep(5000);
        //if they are not matching.....means they will pass .... negative case scenario
        String checkLoginVsDashBoard = actualTitle2.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLoginVsDashBoard);


    }
}
