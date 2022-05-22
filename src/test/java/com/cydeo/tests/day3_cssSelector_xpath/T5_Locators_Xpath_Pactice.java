package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_Locators_Xpath_Pactice {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //WebElement userName = driver.findElement(By.xpath("//input[@class='login-inp']"));
        WebElement userName = driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        userName.sendKeys("incorrect");
        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@value='Reset password']"));
        resetPasswordButton.click();
        WebElement errorLabel = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualErrorLabelText=errorLabel.getText();
        String expectedErrorLabelText="Login or E-mail not found";

        if(actualErrorLabelText.equals(expectedErrorLabelText)){
            System.out.println("Label text verification passed");
        }else{
            System.out.println("Label text verification failed");
        }

        driver.close();



    }
}
/*
TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Enter incorrect username into login box:
4- Click to `Reset password` button
5- Verify “error” label is as expected
Expected: Login or E-mail not found
PS: Inspect and decide which locator you should be using to locate web elements.
PS2: Pay attention to where to get the text of this button from
 */