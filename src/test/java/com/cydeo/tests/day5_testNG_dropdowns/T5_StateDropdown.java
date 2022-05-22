package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_StateDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void dropDownTest(){
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateSelection.selectByVisibleText("Illinois");

        stateSelection.selectByValue("VA");

        stateSelection.selectByIndex(5);

        String actualSelectedOption=stateSelection.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelectedOption,"California");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}



/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */
