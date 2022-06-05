package com.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/error")
public class Error implements ErrorController {

    @GetMapping("/403")
    public ModelAndView error403(){
        return new ModelAndView("/403");
    }
}
