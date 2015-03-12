package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonManager;

/**
 * Created by iuliana.grajdeanu on 2/1/15.
 * Decription: this a plain manager class
 */
public class PlainPersonManagerImpl implements PersonManager {
    PersonRepository repo;

    public PlainPersonManagerImpl(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public int save(Person person) {
        return repo.save(person);
    }
}
