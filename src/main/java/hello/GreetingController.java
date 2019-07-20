package hello;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//该注释标记为一个控制器，每个方法返回一个域对象 是@Controller和@ResponseBody的缩写
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();//自动计数的功能 用于作为id

    /**
     * 注释可以确保对/greeting的http请求映射到greeting方法
     * @RequestMapping(method=GET) 默认匹配get、post、put，缩小映射范围，默认匹配全部
     * 这个是@RequestParam(value="name", defaultValue="World")参数绑定Greeting（）方法中，先查询是否
     * 存在name的参数，不存在则使用defaultvalue的参数
     * 函数返回的数据类型是Greeting 的对象，并且通过Spring HTTP 消息转换器自动转换为json
     * */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}