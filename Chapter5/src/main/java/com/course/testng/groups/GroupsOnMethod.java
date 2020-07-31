package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.printf("这是服务端组测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.printf("这是服务端组测试方法2！！");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.printf("这是客户端组测试方法1");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.printf("这是客户端组测试方法2！！");
    }
    @BeforeGroups(groups = "server")
    public void beforeGroupsOnSever(){
        System.out.printf("这是服务端组运行之前运行的方法");
    }
    @AfterGroups(groups = "server")
    public void afterGroupsOnSever(){
        System.out.printf("这是服务端组运行之前运行的方法");
    }
    @BeforeGroups(groups = "client")
    public void beforeGroupsOnClient(){
        System.out.printf("这是服务端组运行之前运行的方法");
    }
    @AfterGroups(groups = "client")
    public void afterGroupsOnClient(){
        System.out.printf("这是服务端组运行之前运行的方法");
    }

}

