package com.shawn.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/29 0029
 */
@ConfigurationProperties(prefix = "config")
public class ConfigBean {

    private String name;

    private String title;

    private String demo;

    private String share;

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

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

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
}
