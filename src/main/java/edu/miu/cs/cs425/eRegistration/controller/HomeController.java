package edu.miu.cs.cs425.eRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping( value = {"/home"})
@Controller
public class HomeController {
    @GetMapping
    public String displayHomePage(){
        return "home/index";
    }
}
