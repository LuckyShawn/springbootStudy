package com.shawn.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/29 0029
 */
@Configuration
@ConfigurationProperties(prefix = "demo")
@PropertySource("classpath:demo.properties")
public class ConfigDemoBean {
    private String name;

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
