package com.rasl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping({"/", "/home"})
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/stopwatch")
    public String stopwatch(Model model){
        return "stopwatch";
    }
}