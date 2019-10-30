package com.dubbo.inter.Service;

import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface OrderService {

    List<User> getList();

    List<Order> getOrderList();

}
