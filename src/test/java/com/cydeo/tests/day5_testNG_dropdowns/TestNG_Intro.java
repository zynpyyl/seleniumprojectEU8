package com.cydeo.tests.day5_testNG_dropdowns;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("Before class is running...");
    }

    @AfterClass
    public void teardownMethod(){
        System.out.println("After class is running...");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running...");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running...");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test1 is running...");
        //Assert equals
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);

    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test2 is running...");
        //Assert equals
        String actual="apple";
        String expected="apple";
        Assert.assertTrue(actual.equals(expected));
    }

}
