package com.example.onlineShop.Controller;

import com.example.onlineShop.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {

    @Autowired
    private ShoesRepository repository;

    @RequestMapping("/testing")
    public String index(Model model) {
        model.addAttribute("shoes", repository.findAll());
        return "index";
    }
}

