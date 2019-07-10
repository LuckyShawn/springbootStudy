package com.shawn.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/thy")
public class ThymeleafController {

    @RequestMapping("/hello")
    public ModelAndView thy(Model model){
        return new ModelAndView("thymeleaf");
    }
}
