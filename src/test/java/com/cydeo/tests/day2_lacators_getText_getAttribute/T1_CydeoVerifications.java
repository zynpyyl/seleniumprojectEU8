package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        boolean containsCydeo=driver.getCurrentUrl().contains("cydeo");

        boolean verifyTitle=driver.getTitle().equals("Practice");

        System.out.println("containsCydeo = " + containsCydeo);

        System.out.println("verifyTitle = " + verifyTitle);;

        driver.close();


    }
}


/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */