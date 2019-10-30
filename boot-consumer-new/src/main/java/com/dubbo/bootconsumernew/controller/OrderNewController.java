package com.dubbo.bootconsumernew.controller;

import com.dubbo.bootconsumernew.Service.OrderNewService;
import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderNewController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/ttt")
    public List<User> list() {
        return orderService.getList();
    }
}
