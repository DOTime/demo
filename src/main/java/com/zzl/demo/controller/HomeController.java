package com.zzl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home"})
    public String toHome(Model model) {
        model.addAttribute("title", "欢迎！");
        return "home";
    }
}
