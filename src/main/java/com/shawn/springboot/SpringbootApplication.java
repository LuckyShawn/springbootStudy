package com.shawn.springboot;

import com.shawn.springboot.bean.ConfigBean;
import com.shawn.springboot.bean.ConfigDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties({ConfigBean.class})
@EnableConfigurationProperties({ConfigDemoBean.class})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
