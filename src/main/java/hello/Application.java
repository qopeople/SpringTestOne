package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 遍历注释，添加集合了@Configuration、@EnableAutoConfiguration
 * @ComponentScan注释，具有自动添加程序上下文bean、添加同类包中的组件
 * */
@SpringBootApplication
public class Application {
/**使用Spring Boot的SpringApplication.run（）方法来启动应用程序
 * 也就是主类
 * */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}