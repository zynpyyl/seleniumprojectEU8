package com.cydeo.tests.day4_findElements_checkBox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_Xpath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/multiple_buttons");
        WebElement button1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        button1.click();
        String expectedText = "Clicked on button one!";
        String text=driver.findElement(By.xpath("//p[@id='result']")).getText();
        if(text.equals(expectedText)){
            System.out.println("button text verification passed");
        }else{
            System.out.println("button text verification failed");
        }

        driver.close();

    }
}

/*
1. Open Chrome browser
2. Go to http://practice.cydeo.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected: Expected: “Clicked on button one!”
 */