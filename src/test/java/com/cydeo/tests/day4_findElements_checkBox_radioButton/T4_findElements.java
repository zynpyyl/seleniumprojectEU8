package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());
        for (WebElement link : allLinks) {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

        driver.close();




    }
}

/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */