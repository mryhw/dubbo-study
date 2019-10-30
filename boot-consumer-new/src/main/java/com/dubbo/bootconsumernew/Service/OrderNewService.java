package com.dubbo.bootconsumernew.Service;

import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderNewService implements OrderService {

    @Reference
    UserinfoService userinfoService;

    @Override
    public List<User> getList() {
        List<User> list = userinfoService.getList();
        return list;
    }

    @Override
    public List<Order> getOrderList() {
        return null;
    }
}
