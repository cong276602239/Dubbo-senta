package org.demo.dto.order;

import org.demo.dto.user.UserDto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by jiangbin on 2020/6/8.
 */
public class OrderDto implements Serializable {

    private UserDto user;

    private String no;

    private BigDecimal amount;


    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
