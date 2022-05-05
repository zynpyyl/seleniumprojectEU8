package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");
        WebElement labelRememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String actualLabel=labelRememberMe.getText();
        String expectedlabel="Remember me on this computer";
        if(actualLabel.equals(expectedlabel)){
            System.out.println("Label verification passed");
        }else{
            System.out.println("Label verification failed");
        }
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordLinkText=forgotPasswordLink.getText();
        System.out.println(actualForgotPasswordLinkText);
        String expectedForgotPasswordLinkText="Forgot your password?";
        if(expectedForgotPasswordLinkText.equals(actualForgotPasswordLinkText)){
            System.out.println("Password link text verification passed");
        }else{
            System.out.println("Password link text verification failed");
        }
        String actualForgotPasswordHrefAttribute=forgotPasswordLink.getAttribute("href");
        String expectedForgotPasswordHrefAttribute="forgot_password=yes";
        if(actualForgotPasswordHrefAttribute.contains(expectedForgotPasswordHrefAttribute)){
            System.out.println("Password link attribute verification passed");
        }else{
            System.out.println("Password link attribute verification failed");
        }

        driver.close();



    }
}
/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes
PS: Inspect and decide which locator you should be using to locate web elements.
 */