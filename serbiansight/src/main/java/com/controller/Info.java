package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Info {

    @RequestMapping("/info")
    public ModelAndView info(){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("info");
            return modelAndView;
        }
}
