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
public class PersonsController {

    @RequestMapping({"/", "/person"})
    public String list(Model model) {
        List<Person> persons = new ArrayList<>();
        // we locally create a list to populate the model
        persons.add(new Person(1L,"John", "Smith"));
        persons.add(new Person(2L,"Jane", "Doe"));
        persons.add(new Person(3L,"Jason", "Bourne"));
        persons.add(new Person(4L,"Evelyn", "Salt"));

        model.addAttribute(persons);
        return "list";
    }

}
