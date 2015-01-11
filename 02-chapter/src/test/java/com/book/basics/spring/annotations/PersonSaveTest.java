package com.book.basics.spring.annotations;

import com.book.basics.Person;
import com.book.spring.annotations.PersonService;
import com.book.spring.config.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by iuliana.cosmina on 1/11/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class PersonSaveTest {

    @Autowired
    PersonService personService;

    
    @Test
    public void savePerson() {
        personService.save(new Person("John", "Smith", "1980-04-13"));
    }
}
