package com.dubbo.bootprovider.controller;

import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserinfoService userinfoService;

    @ResponseBody
    @RequestMapping("/listOrder")
    public List<Order> getOrderList() {
        return userinfoService.getUserOrder();
    }
}
