package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_MultipleSelect {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void multipleSelect(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select multipleSelect = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        multipleSelect.selectByIndex(0);
        multipleSelect.selectByIndex(1);
        multipleSelect.selectByIndex(2);
        multipleSelect.selectByIndex(3);
        multipleSelect.selectByIndex(4);
        multipleSelect.selectByIndex(5);
        for (WebElement each : multipleSelect.getAllSelectedOptions()) {
            System.out.println(each.getText());
        }
        multipleSelect.deselectAll();

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}
/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */