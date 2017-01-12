package com.book.web;

import com.book.util.PersonGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
@Controller
public class PersonsController {

    @Autowired
    private PersonGenerator personGenerator;

    @RequestMapping("/persons")
    public String list(Model model,HttpServletRequest rq) {
        model.addAttribute("persons", personGenerator.getAll());
        return "persons/list";
    }

}
