package com.example.reel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/world-news")
    public String worldNews( Model model) {
        model.addAttribute("title", "Мировые Новости");
        return "world-news";
    }
    @GetMapping("/usa")
    public String usa( Model model) {
        model.addAttribute("title", "U.S.A");
        return "usa";
    }
    @GetMapping("/usaа")
    public String usaа( Model model) {
        model.addAttribute("title", "U.S.Aа");
        return "usaа";
    }

}