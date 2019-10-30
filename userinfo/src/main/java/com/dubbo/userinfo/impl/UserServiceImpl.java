package com.dubbo.userinfo.impl;

import com.dubbo.inter.Service.UserinfoService;
import com.dubbo.inter.vo.Order;
import com.dubbo.inter.vo.User;
import org.springframework.stereotype.Service;
import sun.jvm.hotspot.debugger.linux.sparc.LinuxSPARCThreadContext;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserinfoService {

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
        return null;
    }
}
