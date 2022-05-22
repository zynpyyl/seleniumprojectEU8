package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropdown(){

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        String defaultOption = simpleDropdown.getFirstSelectedOption().getText();
        String expectedOption= "Please select an option";
        Assert.assertEquals(defaultOption,expectedOption);

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String defaultState = stateDropdown.getFirstSelectedOption().getText();
        String expectedState= "Select a State";
        Assert.assertEquals(defaultState,expectedState);
    }

}

/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */