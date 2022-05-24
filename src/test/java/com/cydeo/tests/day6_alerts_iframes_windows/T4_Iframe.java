package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframe(){
        driver.get("https://practice.cydeo.com/iframe");
    //    driver.switchTo().frame("mce_0_ifr"); //switching to iframe by id
    //    driver.switchTo().frame(0); //switching to frame by index
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe"))); //switching to iframe by Web Element
        WebElement text = driver.findElement(By.xpath("//p"));
        String actualText = text.getText();
        String expectedText = "Your content goes here.";

        Assert.assertTrue(text.isDisplayed());
        Assert.assertEquals(actualText,expectedText);

        driver.switchTo().parentFrame();
        WebElement text1 = driver.findElement(By.xpath("//h3"));
        String actualText1 = text1.getText();
        String expectedText1 = "An iframe containing the TinyMCE WYSIWYG editor";

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


}

/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */