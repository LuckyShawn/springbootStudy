package com.shawn.springboot.controller;

import com.shawn.springboot.bean.ConfigBean;
import com.shawn.springboot.bean.ConfigDemoBean;
import com.shawn.springboot.bean.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: yang.xiao
 * @Date: 2018/11/29 0029
 */

@RestController
public class helloController {

    @Autowired
    private SimpleBean simpleBean;

    //@Autowired
    //private ConfigBean configBean;

    @Autowired
    private ConfigDemoBean configDemoBean;

    @RequestMapping("/hello")
    public List<String> hello(){
        List<String> list = new ArrayList<>();
        list.add(simpleBean.getName());
        list.add(simpleBean.getTitle());
        list.add("Hello spring boot");
        return list;
    }

    @RequestMapping("/config")
    public Map<String,String> configTest(){
        Map<String,String> map = new HashMap<>();
        map.put("name",configDemoBean.getName());
        map.put("title",configDemoBean.getTitle());
       /* map.put("demo",configBean.getDemo());
        map.put("share",configBean.getShare());*/

        return map;

    }
}
