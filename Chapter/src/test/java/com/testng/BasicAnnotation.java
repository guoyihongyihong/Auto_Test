package com.testng;

import org.testng.annotations.*;

/**
 * @ClassName BasicAnnotaion
 * @Description TODO
 * @Author wu.guo
 * @Date 2020/1/3 11:51
 * @Version 1.o
 **/

@Test(groups = "stu1")
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("BasicAnnotation.testCase1");
    }

    @Test
    public void testCase2(){
        System.out.println("BasicAnnotation.testCase2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BasicAnnotation.beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("BasicAnnotation.afterMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BasicAnnotation.beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("BasicAnnotation.afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BasicAnnotation.beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("BasicAnnotation.afterSuite");
    }
}
