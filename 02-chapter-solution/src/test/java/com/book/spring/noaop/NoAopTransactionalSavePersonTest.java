package com.book.spring.noaop;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/21/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/app-noaop-cfg.xml", "classpath:spring/test-db-config.xml"})
public class NoAopTransactionalSavePersonTest {

    @Autowired
    @Qualifier("personManager")
    PersonManager personManager;

    @Test
    public void savePerson() {
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = personManager.save(person);
        assertEquals(1, result);
    }
}
