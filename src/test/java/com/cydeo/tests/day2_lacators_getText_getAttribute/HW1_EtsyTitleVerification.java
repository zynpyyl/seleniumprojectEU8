package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com");
        WebElement searchBox=driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        String expectedTitle="Wooden spoon | Etsy";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

        driver.close();

    }
}
/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */