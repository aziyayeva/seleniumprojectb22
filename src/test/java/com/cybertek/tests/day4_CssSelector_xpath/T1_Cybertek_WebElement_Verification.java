package com.cybertek.tests.day4_CssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Cybertek_WebElement_Verification {
    public static void main(String[] args) {

        //**** TC #1: PracticeCybertek.com_ForgotPassword WebElement verification ****
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println("HomeLink is Displayed - " + homeLink.isDisplayed());

        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        //c. “E-mail” text
        WebElement emailLAbel = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("emailLAbel.isDisplayed() = " + emailLAbel.isDisplayed());

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());

        //e. “Retrieve password” button
        WebElement passwordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println("passwordButton.isDisplayed() = " + passwordButton.isDisplayed());

        //f. “Powered by Cybertek School” text
        WebElement textPoweredByCybertekSchool = driver.findElement(By.cssSelector("div[style ='text-align: center;']"));
        System.out.println("textPoweredByCybertekSchool.isDisplayed() = " + textPoweredByCybertekSchool.isDisplayed());

        //4. Verify all WebElements are displayed.
        //System.out.println("textPoweredByCybertekSchool.isDisplayed() = " + textPoweredByCybertekSchool.isDisplayed());




    }
}
