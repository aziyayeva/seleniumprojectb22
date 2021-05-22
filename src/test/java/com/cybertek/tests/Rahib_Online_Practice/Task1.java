package com.cybertek.tests.Rahib_Online_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {

        //Test Case NO=1
        //
        //WARM UP:
        //
        //Amazon.com Search "Wooden Spoon"
        //
        //1. Build the WebDriverManager and call Chrome Driver
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //
        //2. Go to Amazon.com
        driver.get("https://www.amazon.com/");
        //
        //3. Locate the amazon search bar
        WebElement woodenSpoon = driver.findElement(By.xpath("//input[id='twotabsearchtextbox']"));
        woodenSpoon.sendKeys("Wooden Spoon" + Keys.ENTER);

        String expectedTitle = "Wooden Spoon";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Passed");
        } else {
            System.out.println("Passed");


            //
            //4. Send "Wooden Spoon" and click search
            //
            //5. Check the title with if conditon
        }
    }
}
