package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.printf("GroupsOnClass1中的stu111运行");
    }
    public void stu2(){
        System.out.printf("GroupsOnClass1中的stu222运行");
    }
}
