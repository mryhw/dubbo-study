package com.dubbo.bootconsumer.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.inter.Service.OrderService;
import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 订单的实现类
 * @Author      yanghanwei
 * @Mail        yanghanwei@geotmt.com
 * @Date        14:50 2019-10-30
 * @Version     v1
 **/
@com.alibaba.dubbo.config.annotation.Service
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserinfoService userinfoService;

    @Override
    public List<User> getList() {
        List<User> list = userinfoService.getList();
        System.out.println(list);
        return list;
    }

    @Override
    public List<Order> getOrderList() {
        List<Order> list = new ArrayList<>();

        list.add(new Order("order", "name1"));
        list.add(new Order("order2", "name2"));
        list.add(new Order("order3", "name3"));

        return list;
    }
}
