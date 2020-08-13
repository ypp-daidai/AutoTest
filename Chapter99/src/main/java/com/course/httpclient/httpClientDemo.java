package com.course.httpclient;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import sun.net.www.http.HttpClient;

import java.io.IOException;

import java.io.IOException;

public class httpClientDemo {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet get = new HttpGet("https://www.baidu.com/");
        DefaultHttpClient client =new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result= EntityUtils.toString(response.getEntity());
        System.out.print(result);

    }

}


