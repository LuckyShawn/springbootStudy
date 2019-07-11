package com.shawn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("bootstrap")
@RestController
public class BootStrapController {

    @RequestMapping("product")
    public ModelAndView product(){
        return new ModelAndView("bootstrap");
    }

    @RequestMapping("album")
    public ModelAndView album(){
        return new ModelAndView("bootstrap1");
    }
}
