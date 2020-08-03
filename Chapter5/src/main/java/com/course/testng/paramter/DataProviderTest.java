package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data1")
    public void testDataProvider(String name, int age) {
        System.out.println("testDataProvider" + " " + "name=" + name + " " + "age=" + age);
    }

    @DataProvider(name = "data1")
    public Object[][] dataMehthod1() {
        Object[][] objects = new Object[][]{
                {"zhangsan", 20},
                {"lisi", 10}
        };
        return objects;
    }


    @Test(dataProvider = "testMethod")
    public void dataTest1(String name, int age) {
        System.out.printf("dataTest11" + "name:" + name + " " + "age:" + age);
    }

    @Test(dataProvider = "testMethod")
    public void dataTest2(String name, int age) {
        System.out.printf("dataTest22" + "name:" + name + " " + "age:" + age);
    }

    @DataProvider(name = "testMethod")
    public Object[][] dataMehthod2(Method method) {
        Object[][] result = null;
        if (method.getName().equals("dataTest1")) {
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 10}
            };
        } else if (method.getName().equals("dataTest2")) {
            result = new Object[][]{
                    {"ZHANGWU", 30},
                    {"ZHAOLIU", 40}
            };

        }
        return result;
    }
}
