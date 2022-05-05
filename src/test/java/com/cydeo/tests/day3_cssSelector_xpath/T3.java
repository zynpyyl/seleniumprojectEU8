package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com");

       // WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        // WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
         WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String actualLogInButtonText = logInButton.getAttribute("value");
        String expectedLogInButtonText = "Log In";

        if(actualLogInButtonText.equals(expectedLogInButtonText)){
            System.out.println("Log in button text verification passed");
        }else{
            System.out.println("Log in button verification failed");
        }

        driver.close();

    }
}
/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
PS: Inspect and decide which locator you should be using to locate web elements.
PS2: Pay attention to where to get the text of this button from
         */