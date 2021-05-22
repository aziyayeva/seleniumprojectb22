package com.cybertek.tests.day4_CssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_CSS {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get(" https://www.amazon.com");

        WebElement searchTerm = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox'] "));


    }
}
