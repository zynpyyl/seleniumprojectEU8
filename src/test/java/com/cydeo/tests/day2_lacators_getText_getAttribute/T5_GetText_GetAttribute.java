package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://practice.cydeo.com/registration_form");
    String expectedHeader="Registration form";
    WebElement element= driver.findElement(By.tagName("h2"));
    String actualHeader=element.getText();
    if(expectedHeader.equals(actualHeader)){
        System.out.println("Passed");
    }else{
        System.out.println("Failed");
    }

        WebElement firstNameInput=driver.findElement(By.name("firstname"));
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");
        String expectedPlaceHolder = "first name";
        if(expectedPlaceHolder.equals(actualPlaceHolder)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }
}

/*
TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
Expected: first name
 */