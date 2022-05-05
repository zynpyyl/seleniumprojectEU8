package com.cydeo.reviewWithOscar.week01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoBlaze {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.demoblaze.com/index.html");

        String title=driver.getTitle();

        System.out.println("title = " + title);

        if(title.equals("STORE")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        driver.close();

    }
}
