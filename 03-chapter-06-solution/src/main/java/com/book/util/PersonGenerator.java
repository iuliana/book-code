package com.book.util;

import com.book.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.cosmina on 3/19/15.
 */
@Service
public class PersonGenerator {

    public List<Person> getAll(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Smith", "1980-02-03"));
        persons.add(new Person("Jane", "Doe", "1980-02-01"));
        persons.add(new Person("Jason", "Bourne", "1980-10-03"));
        persons.add(new Person("Evelyn", "Salt", "1980-02-03"));

        return persons;
    }
}
