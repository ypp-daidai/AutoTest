package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name,int age){
        System.out.printf("name="+name+" "+"age="+age);
    }
}


