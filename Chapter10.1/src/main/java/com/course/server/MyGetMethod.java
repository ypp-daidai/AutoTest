package com.course.server;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class MyGetMethod {
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getCookies(HttpServletResponse response){
        //HttpServletResponse装响应信息的类
        //HttpServletRequest装请求信息的类
        Cookie cookie =new Cookie("login","ture");
        response.addCookie(cookie);
        return "模拟一个带有cookies的get请求";
    }

    //要求客户端携带cookies信息访问
    //这是一个需要携带cookies新的才能访问的get请求
    @RequestMapping(value ="/get/with/cookies",method = RequestMethod.GET)
    public String getWithCookies(HttpServletRequest request){
        Cookie[] cookies=request.getCookies();
        if (Objects.isNull(cookies) ){
        }
        for (Cookie cookie:cookies ){
            if (cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "恭喜你访问成功";
            }
        }
        return "你必须携带cookies信息来请求";
    }

    //10.5开发一个携带参数才能访问的get请求
    //第一种实现方式url：key=value&key=value
    //模拟一个获取商品列表的请求
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    public Map<String, Integer> getList(@RequestParam Integer start, @RequestParam Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋子",400);
        myList.put("裤子",200);
        myList.put("袜子",10);
        return myList;
    }
    //第二种方式
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    public Map myGetLList(@PathVariable Integer start,
                          @PathVariable Integer end){
        Map<String,Integer> myList = new HashMap<>();
        myList.put("鞋子",400);
        myList.put("裤子",200);
        myList.put("袜子",10);
        return myList;
    }

}
