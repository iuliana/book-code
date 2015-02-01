package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;

/**
 * Created by iuliana.grajdeanu on 2/1/15.
 * Decription: this a plain service class
 */
public class PlainPersonServiceImpl implements PersonService {
    PersonRepository repo;

    public PlainPersonServiceImpl(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public int save(Person person) {
        return repo.save(person);
    }
}
