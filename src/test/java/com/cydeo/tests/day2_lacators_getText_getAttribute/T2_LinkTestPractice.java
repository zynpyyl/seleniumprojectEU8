package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTestPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        //driver.findElement(By.linkText("A/B Testing")).click();

        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));

        abTestLink.click();

        String actualTitle=driver.getTitle();

        String expectedTitle="No A/B Test";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.navigate().back();

        actualTitle=driver.getTitle();

        expectedTitle="Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.close();



    }

}
/*
    TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice
     */