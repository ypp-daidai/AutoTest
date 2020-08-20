package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//教程内官网的例子
@Controller
@EnableAutoConfiguration
public class SampleContrller {
    public static void main(String[] args){
        SpringApplication.run(SampleContrller.class,args);
    }
    @RequestMapping("/test")
    @ResponseBody
    String home(){
        return ("hello world!!");
    }
}
