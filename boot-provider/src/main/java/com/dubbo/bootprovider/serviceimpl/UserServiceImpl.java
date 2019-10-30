package com.dubbo.bootprovider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@com.alibaba.dubbo.config.annotation.Service // 暴露服务
@Service
public class UserServiceImpl implements UserinfoService {

    @Reference
    OrderService orderService;

    @Override
    public List<User> getList() {
        List<User> list = new ArrayList<>();

        list.add(new User("zhangsan","12"));
        list.add(new User("zhangsan1","13"));
        System.out.println("222222222222222222222222222222222222");
        return list;
    }

    @Override
    public List<Order> getUserOrder() {
        return orderService.getOrderList();
    }


}
