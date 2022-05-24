package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void t1(){
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = result.getText();
        String expectedText = "You successfully clicked an alert";

        Assert.assertTrue(result.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void t2(){
        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = result.getText();
        String expectedText = "You clicked: Ok";

        Assert.assertTrue(result.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void t3(){
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();
        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
        String actualText = result.getText();
        String expectedText = "You entered: hello";

        Assert.assertTrue(result.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.

TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed.
 */