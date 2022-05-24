package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void login_crm(WebDriver driver){
        driver.get("http://login1.nextbasecrm.com/");
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameInputBox.sendKeys("helpdesk1@cybertekschool.com");
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }

    public static void login_crm(WebDriver driver,String username,String password){
        driver.get("http://login1.nextbasecrm.com/");
        WebElement userNameInputBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userNameInputBox.sendKeys(username);
        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInputBox.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }


}


/*
TC #4: Create utility method
1. Create a new method for login
2. Create a method to make Task3 logic re-usable
3. When method is called,it should simply login
This method should have at least 2 overloaded versions.
Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
 */