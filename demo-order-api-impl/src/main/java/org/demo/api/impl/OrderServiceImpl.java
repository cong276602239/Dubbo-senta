package org.demo.api.impl;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.demo.api.dao.OrderDao;
import org.demo.api.service.OrderService;
import org.demo.api.service.UserService;
import org.demo.dto.order.OrderDto;
import org.demo.exception.MyException;
import org.demo.pojo.order.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by jiangbin on 2020/6/8.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);


    @Autowired
    private UserService userService;


    @Autowired
    private OrderDao orderDao;

    @GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-tx")
    @Override
    public void insert(OrderDto orderDto) {
        logger.info("into orderservice insert");
        System.out.println("开始全局事务，XID = " + RootContext.getXID());
            Order order = new Order();
            order.setUserId(1L);
            order.setNo("111111");
            order.setAmount(new BigDecimal(0));
            orderDao.insert(order);
            userService.insert(orderDto.getUser());
            int i=1/0;

    }
}
