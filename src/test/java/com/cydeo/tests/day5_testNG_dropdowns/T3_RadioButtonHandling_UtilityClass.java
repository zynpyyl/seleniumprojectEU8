package com.cydeo.tests.day5_testNG_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


class T3_RadioButtonHandling_UtilityClass {
        public static void main(String[]args){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        clickAndVerifyRadioButton(driver,"sport","basketball");

        }
        private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute,String idValue){

            List<WebElement> elements = driver.findElements(By.name(nameAttribute));

            for (WebElement element : elements) {
                if(element.getAttribute("id").equals(idValue)){
                    element.click();
                    System.out.println(idValue+" is selected");
                }
            }

        }
    }
/*
Create a utility method to handle above logic. Method name: clickAndVerifyRadioButton Return type: void or boolean
Method args:
1. WebDriver
2. Name attributes String (for providing which group of radio buttons)
3. Id attributes String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the matching option, it should click and verify option is Selected.
Print out verification: true
 */