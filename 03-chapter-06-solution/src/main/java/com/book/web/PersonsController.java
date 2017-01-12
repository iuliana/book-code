package com.book.web;

import com.book.util.PersonGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
@Controller
public class PersonsController {

    private Logger logger = LoggerFactory.getLogger(PersonsController.class);


    @Autowired
    private PersonGenerator personGenerator;

   /* @RequestMapping( "/persons")
    public String list(Model model) {
        model.addAttribute("persons", personGenerator.getAll());
        return "persons/list";
    }

    @RequestMapping("/persons.xls")
    public String excel(Model model) {
        model.addAttribute("persons", personGenerator.getAll());
        return "persons/list.xls";
    }

    @RequestMapping("/persons.pdf")
    public String pdf(Model model) {
        model.addAttribute("persons", personGenerator.getAll());
        return "persons/list.pdf";
    }*/

    @RequestMapping("/persons")
    public String list(Model model, HttpServletRequest rq) {
        model.addAttribute("persons", personGenerator.getAll());
        if (rq.getRequestURL().toString().endsWith("xls")) {
            return "persons/list.xls";
        } else if (rq.getRequestURL().toString().endsWith("pdf")) {
            return "persons/list.pdf";
        }
        return "persons/list";
    }


    @RequestMapping(value = "/persons/", params={"minAmount"})
    public void amount(@RequestParam @NumberFormat(style = NumberFormat.Style.CURRENCY) Double minAmount
    ) {
        logger.info("Amount value= " + minAmount);
    }

}
