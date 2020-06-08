package org.demo.api.service;

import org.demo.dto.order.OrderDto;
import org.demo.exception.MyException;

/**
 * Created by jiangbin on 2020/6/8.
 */
public interface OrderService {

    void insert(OrderDto order);


}
