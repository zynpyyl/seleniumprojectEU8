package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.tagName("h3"));
        String actualHeaderText=header.getText();
        String expectedHeaderText="Log in to ZeroBank";

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }

        driver.close();


    }
}

/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */