package hello;




@Controller
@EnableAutoConfiguration
public class SampleCotroller {

    public static void main(String[] args){
        SpringApplication.run(SampleCotroller.class,args);
    }
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world";
    }

}
