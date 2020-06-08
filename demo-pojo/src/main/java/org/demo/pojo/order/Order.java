package org.demo.pojo.order;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by jiangbin on 2020/6/8.
 */
public class Order implements Serializable {

    private Long userId;

    private String no;

    private BigDecimal amount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
