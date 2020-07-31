package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.printf("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.printf("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("BeforeMethod是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.printf("AfterMethod是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.printf("BeforeClass是在类运行之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.printf("AfterClass是在类运行之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.printf("BeforeSuite是测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.printf("AfterSuite是测试套件");
    }

}
