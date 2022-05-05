package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.className("gb_d"));
        element.click();

        String expectedTitleContains="Gmail";

        String actualTitle=driver.getTitle();

        if(actualTitle.contains(expectedTitleContains)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }

        driver.navigate().back();

        actualTitle=driver.getTitle();

        String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }

        driver.close();


    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */