package com.shawn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("login")
@RestController
public class LoginController {

    @RequestMapping("/index")
    public ModelAndView login() {
        return new ModelAndView("index");
    }
}
