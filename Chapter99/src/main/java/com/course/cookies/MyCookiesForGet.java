package com.course.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForGet {
    private String url;
    private String uri;
    private String uri1;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle=ResourceBundle.getBundle("application", Locale.CHINA);
        url=bundle.getString("test1.url");
        uri=bundle.getString("getCookies.uri");
        uri1=bundle.getString("test.get.with.cookies");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        String testUrl=url+uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
        HttpResponse response= client.execute(get);
        result= EntityUtils.toString(response.getEntity());

        this.store = client.getCookieStore();
        List<Cookie> ccookiesList= store.getCookies();

        for (Cookie cookie:ccookiesList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.printf("cookies name="+name+","+"cookies value="+value);

        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String testUrl=url+uri1;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
        //设置cookies信息
        client.setCookieStore(store);
       this.store = client.getCookieStore();
        System.out.println("返回结果："+store);

        HttpResponse response = client.execute(get);
       //String result= EntityUtils.toString(response.getEntity());
        //System.out.println("返回结果："+result);
        System.out.println(response);
        //获取相应的状态吗
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.printf("statusCode："+statusCode);
    }
}
