package com.cydeo.tests.day7_webTables_utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRMUtilitiesScenario {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void login(){
        driver.get("http://login1.nextbasecrm.com/");
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameInputBox.sendKeys("helpdesk1@cybertekschool.com");
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        BrowserUtils.verifyTitle(driver,"Portal");

      //CRM_Utilities.login_crm(driver);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}

/*
TC #3: Login scenario
1. Create new test and make setups
2. Goto:http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to`LogIn`button
6. Verify title is as expected:
 Expected: Portal
USERNAME helpdesk1@cybertekschool.com Helpdesk2@cybertekschool.com
PASSWORD UserUser UserUser
 */