package com.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by donghee on 2021/07/07
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
