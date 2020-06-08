package org.demo.api.impl;

import io.seata.spring.annotation.GlobalTransactional;
import org.demo.api.dao.UserDao;
import org.demo.api.service.UserService;
import org.demo.dto.user.UserDto;
import org.demo.pojo.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jiangbin on 2019/3/6.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);


    @Autowired
    private UserDao userDao;

    @GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-tx")
    @Override
    public void insert(UserDto userDto) {
        logger.info("服务者新增");
        User user=new User();

        user.setName(userDto.getName());
        userDao.insert(user);
    }

    @Override
    public UserDto getUser(UserDto userDto) {
        logger.info("服务者详情");
        return null;
    }
}
