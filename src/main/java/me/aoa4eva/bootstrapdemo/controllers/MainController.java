package me.aoa4eva.bootstrapdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showFirstPage()
    {
        return "frontpage";
    }

    @GetMapping("/showrecipes")
    public String showRecipes()
    {
            return "recipes";
    }
}
