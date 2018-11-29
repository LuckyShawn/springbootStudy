package com.shawn.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/29 0029
 */
@Component
public class SimpleBean {

    @Value("${shawn.name}")
    private String name;

    @Value("${shawn.title}")
    private String title;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
