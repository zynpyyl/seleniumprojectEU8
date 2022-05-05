package com.cydeo.tests.day2_lacators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        WebElement googleSearchBox=driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle="apple";

        String actualTitle=driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        driver.close();

    }
}
/*
TC#3: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press enter using keys.ENTER
5- Verify title:
Expected: Title should start with “apple” word
 */