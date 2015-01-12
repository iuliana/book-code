package com.book.pojos;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
public class PersonServiceImpl implements PersonService {
    PersonRepository repo;

    public PersonServiceImpl(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public int save(Person person) {
        return repo.save(person);
    }
}
