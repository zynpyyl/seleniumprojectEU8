package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_Non_Select_DropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void nonSelectDropDown() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement nonSelectDropDown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
     // WebElement nonSelectDropDown = driver.findElement(By.className("btn btn-secondary dropdown-toggle"));
        Thread.sleep(2000);
        nonSelectDropDown.click();
        WebElement faceBook = driver.findElement(By.xpath("//a[.='Facebook']"));
        faceBook.click();
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook – log in or sign up";


        Assert.assertEquals(actualTitle,expectedTitle);


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}


/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */