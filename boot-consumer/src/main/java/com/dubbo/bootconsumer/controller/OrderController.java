package com.dubbo.bootconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/test")
    public List<User> getUser () {
        return orderService.getList();
    }
}
