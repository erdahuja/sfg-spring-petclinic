package com.springframework.springpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    public Long getId( ) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public boolean isNew( ) {
        return this.id == null;
    }
}
