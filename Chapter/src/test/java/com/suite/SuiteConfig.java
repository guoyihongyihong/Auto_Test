package com.suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @ClassName SuiteConfig
 * @Description TODO
 * @Author wu.guo
 * @Date 2020/1/3 14:27
 * @Version 1.o
 **/
public class SuiteConfig {
    @Test
    @Parameters({"name","age"})
    public void test1(String name,String age){
        System.out.println("SuiteConfig.test1");
        System.out.println("name = " + name + "age + " + age);
    }
}
