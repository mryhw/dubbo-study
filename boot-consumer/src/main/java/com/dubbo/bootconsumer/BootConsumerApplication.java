package com.dubbo.bootconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 *  1.导入依赖
 *      dubbo-starter
 *      dubbo 其他依赖  zk 的依赖
 *
 *
 */
@EnableDubbo
@SpringBootApplication
public class BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApplication.class, args);
    }

}
