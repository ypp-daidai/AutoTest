package com.course.cookies;

import netscape.javascript.JSObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForPost {
    private String urlPost;
    private String uriPost;
    private String getUrlPost;
    private ResourceBundle bundle;
    @BeforeTest
    public void beforeTest(){
        bundle=ResourceBundle.getBundle("application", Locale.CHINA);
        urlPost=bundle.getString("test1.url");
        uriPost=bundle.getString("/post/with/cookies");
        getUrlPost=urlPost+uriPost;
    }
    @Test
    public void testGetCookies() throws IOException {
        //String result;
        HttpGet get = new HttpGet(getUrlPost);
        DefaultHttpClient client=new DefaultHttpClient();
        HttpResponse response= client.execute(get);
        //result= EntityUtils.toString(response.getEntity());
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testPostMethod() throws UnsupportedEncodingException {
        //声明一个client对象，用来进行方法的执行
        DefaultHttpClient client=new DefaultHttpClient();
        //声明一个方法，做为post方法
        HttpPost post= new HttpPost(getUrlPost);
        //添加参数
        JSONObject param= new JSONObject();
        param.put("name","huahansan");
        param.put("age","19");
        //设置请求头信息
        post.setHeader("content-type","application/json");
        //将参数信息添加到方法中
        StringEntity entity=new StringEntity(param.toString(),"utf-8");
        //声明一个对象来进行相应结果的存储

        //设置cookies信息

        //执行post方法

        //获取相应结果

        //处理结果。判断是否符合预期



    }
}
