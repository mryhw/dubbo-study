package com.dubbo.order.impl;

import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserinfoService userinfoService;

    @Override
    public List<User> getList() {
        List<User> list = userinfoService.getList();
        System.out.println(list);
        return null;
    }

    @Override
    public List<Order> getOrderList() {
        return null;
    }
}
