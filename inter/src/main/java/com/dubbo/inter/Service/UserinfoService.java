package com.dubbo.inter.Service;

import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;

import java.util.List;


public interface UserinfoService {

    List<User> getList();

    List<Order> getUserOrder();
}
