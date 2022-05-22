package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");
        WebElement link = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("link.isDisplayed() = " + link.isDisplayed());


        driver.navigate().refresh();
        link = driver.findElement(By.xpath("//a[.='CYDEO']")); //re=assigning web element
        System.out.println("link.isDisplayed() = " + link.isDisplayed());



       }
}


/*
TC #6: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.
This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.
 */