package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1 {
    public static void main(String[] args) {


        //WebDriverManager.chromedriver().setup();

        //WebDriver driver=new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://login1.nextbasecrm.com");

        WebElement userNameInput = driver.findElement(By.name("USER_LOGIN"));

        userNameInput.sendKeys("incorrect"+ Keys.ENTER);

        WebElement passwordInput = driver.findElement(By.name("USER_PASSWORD"));

        userNameInput.sendKeys("incorrect"+Keys.ENTER);

        WebElement loginButton =  driver.findElement(By.className("login-btn"));

        loginButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String actualErrorMessageText = errorMessage.getText();

        String expectedErrorMessageText = "Incorrect login or password";

        if(expectedErrorMessageText.equals(actualErrorMessageText)){
            System.out.println("Error message verification passed");
        }else{
            System.out.println("Error message verification failed");
        }

        driver.close();
    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
PS: Inspect and decide which locator you should be using to locate web elements.
 */