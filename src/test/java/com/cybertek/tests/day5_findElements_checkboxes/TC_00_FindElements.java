package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_00_FindElements {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


       //     WE NEED TO CREATE A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        // ** This Locator will return all the links on the page

        //we are storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a")); // ELEMENTS BY XPATH METHOD


        //3. Print out the texts of all links

        for( WebElement each : listOfLinks) {
            System.out.println(each.getText()); // get text will return us a String
            System.out.println(each.getAttribute("href"));

        }

        //4. Print out how many total link
        int numberOfLinks = listOfLinks.size();
        System.out.println(numberOfLinks);
    }
}
