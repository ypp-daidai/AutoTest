package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.printf("ignore1执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.printf("ignore2不执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.printf("ignore3执行");
    }
}
