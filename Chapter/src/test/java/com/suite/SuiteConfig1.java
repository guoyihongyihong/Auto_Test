package com.suite;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @ClassName SuiteConfig
 * @Description TODO
 * @Author wu.guo
 * @Date 2020/1/3 14:27
 * @Version 1.o
 **/
public class SuiteConfig1 {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        Reporter.log("自己的日志");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
