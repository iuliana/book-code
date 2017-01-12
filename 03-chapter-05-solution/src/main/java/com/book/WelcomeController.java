package com.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by iuliana.cosmina on 5/2/15.
 */
@Controller
public class WelcomeController {

    @RequestMapping
    public String sayhi(Model model){
        model.addAttribute("salute", "Hi!");
        return "welcome";
    }

    @RequestMapping
    public String sayhello(Model model){
        model.addAttribute("salute", "Hello!");
        return "welcome";
    }
}
