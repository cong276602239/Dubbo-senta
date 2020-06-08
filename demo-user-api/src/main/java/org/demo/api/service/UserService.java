package org.demo.api.service;

import org.demo.dto.user.UserDto;

/**
 * Created by jiangbin on 2020/6/5.
 */
public interface UserService {

    void insert(UserDto userDto);

    UserDto getUser(UserDto userDto);
}
