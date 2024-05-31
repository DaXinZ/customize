package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "org.example")
@MapperScan(basePackages = "com.imooc.mapper")
//扫描所有包，以及相关组件包
@ComponentScan(basePackages =  {"org.example","idworker"})
@ComponentScan("org.example.config")

public class Application {
    public static void  main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
