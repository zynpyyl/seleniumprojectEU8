package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectDate_DropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void selectDate(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select year=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1923");
        Select month=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");
        Select day=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);

        Assert.assertEquals(year.getFirstSelectedOption().getText(),"1923");
        Assert.assertEquals(month.getFirstSelectedOption().getText(),"December");
        Assert.assertEquals(day.getFirstSelectedOption().getText(),"1");

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}

/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text Select month using : value attribute Select day using : index number
 */