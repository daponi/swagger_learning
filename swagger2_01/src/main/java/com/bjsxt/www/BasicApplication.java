package com.bjsxt.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableSwagger2 --是springfox提供的一个注解，代表swagger2相关技术开启。
 *  会扫描当前类所在包及其子包中所有的类型中的注解，作为swagger文档的定值
 */
@EnableSwagger2
@SpringBootApplication
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class,args);
    }
}
