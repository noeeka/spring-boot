package com.xiaomao.xiaomao.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Page {
    @Id
    @GeneratedValue
    private String module;
    private String title;

    public String getTitle() {
        return title;
    }


    public String getModule() {
        return module;
    }
}
