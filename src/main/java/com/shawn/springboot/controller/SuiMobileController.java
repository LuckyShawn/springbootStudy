package com.shawn.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/sui")
public class SuiMobileController {

    @RequestMapping("/mobile")
    public ModelAndView sui(){

        return new ModelAndView("suimobile");
    }

}
