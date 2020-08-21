package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Application类的命名公认为入口类
@SpringBootApplication
//自动扫描被@Service,@Repository,@Component,@Controller这些注解标识的类
@ComponentScan("com.course")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }

}
