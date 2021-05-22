package com.cybertek.tests.day4_CssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_multipleButtons {
    public static void main(String[] args) {

        //**** TC #6: XPATH LOCATOR practice *****
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1
        //button[.='Button 1'] - locating using text of the button with XPATH
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        //4. Verify text displayed is as expected:
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("Result text verification Passed!");
        } else {
            System.out.println("Result text verification Failed!");

        }
    }
}
