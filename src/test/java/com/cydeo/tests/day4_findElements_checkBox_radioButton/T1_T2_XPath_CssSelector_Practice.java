package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_T2_XPath_CssSelector_Practice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");
        //a. “Home” link
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link")); //same as above
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));
        WebElement homeLink4 = driver.findElement(By.cssSelector("[href='/']"));//same as a[href
        //b. “Forgot password” header
        WebElement header1 = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header2 = driver.findElement(By.xpath("//h2"));
        WebElement header3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        WebElement header4 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));//same as text()
        //c. “E-mail” text
        WebElement email1 = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement email2 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement email3 = driver.findElement(By.xpath("//label[.='E-mail']"));
        //d. E-mail input box
        WebElement emailInput1 = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement emailInput2 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailInput3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
        //e. “Retrieve password” button
        WebElement password1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement password2 = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement password3 = driver.findElement(By.cssSelector("button.radius"));

        //f. “Powered by Cydeo text
        WebElement cydeoText1 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());
        System.out.println("emailInput1.isDisplayed() = " + emailInput1.isDisplayed());
        System.out.println("password1.isDisplayed() = " + password1.isDisplayed());
        System.out.println("cydeoText1.isDisplayed() = " + cydeoText1.isDisplayed());

        driver.close();


    }
}
/*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
 */