package org.demo.pojo.user;

import java.io.Serializable;

/**
 * Created by jiangbin on 2020/6/5.
 */
public class User implements Serializable {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
