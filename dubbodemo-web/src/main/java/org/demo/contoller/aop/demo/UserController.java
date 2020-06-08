package org.demo.contoller.aop.demo;

import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.demo.api.service.OrderService;
import org.demo.api.service.UserService;
import org.demo.dto.base.BaseResponse;
import org.demo.dto.order.OrderDto;
import org.demo.dto.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiangbin on 2020/6/5.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;



    @RequestMapping(value = "/order/inser", method = RequestMethod.POST)
    public BaseResponse orderInsert(@RequestBody OrderDto orderDto) {
        logger.info("StudentController orderInsert method ");
        BaseResponse baseResponse = new BaseResponse();
        orderService.insert(orderDto);
        return baseResponse;
    }




    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public BaseResponse bindPhone(@RequestBody UserDto userDto) {
        logger.info("StudentController bindPhoneStudentCup method ");
        BaseResponse baseResponse = new BaseResponse();
        userService.insert(userDto);
        return baseResponse;
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public BaseResponse detail(UserDto userDto, HttpServletResponse response) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setData(userService.getUser(userDto));
        return baseResponse;
    }


}
