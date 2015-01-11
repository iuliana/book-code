package com.book.spring.annotations;

import com.book.basics.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
@Component
public class PersonServiceImpl implements PersonService {
    
    @Autowired
    PersonRepository repo;

    @Override
    public int save(Person person) {
        System.out.println("... Person was saved ...");
        return 0;
    }
}
