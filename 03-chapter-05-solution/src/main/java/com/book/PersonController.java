package com.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
@Controller
public class PersonController {

    @RequestMapping({"/", "/person"})
    public String list(Model model) {
        List<Person> persons = new ArrayList<>();
        // we locally create a list to populate the model
        persons.add(new Person("John", "Smith"));
        persons.add(new Person("Jane", "Doe"));
        persons.add(new Person("Jason", "Bourne"));
        persons.add(new Person("Evelyn", "Salt"));

        model.addAttribute(persons);
        System.out.println("Aaaaaaaaaaaa: " + persons);
        return "list";
    }

}
