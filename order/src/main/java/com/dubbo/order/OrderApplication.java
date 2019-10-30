package com.dubbo.order;

import com.dubbo.inter.Service.OrderService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) throws IOException {
//        SpringApplication.run(OrderApplication.class, args);
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");

        System.out.println("=================================================");
        OrderService bean = ioc.getBean(OrderService.class);
        bean.getList();
        ioc.start();
        System.in.read();
    }

}
