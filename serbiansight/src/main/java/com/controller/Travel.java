package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Travel {

    @RequestMapping("/travel")
    public ModelAndView travel () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("travel");
        return modelAndView;
    }
}
