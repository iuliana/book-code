package com.book.plain;


import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonManager;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with pure Java.
 */
public class PlainPersonSaveTest {

    @Test
    public void savePerson() {
        /* Start of setup*/
        PersonRepository repo = new PlainPersonRepository();
        DataSource dataSource = new BasicDataSource();
        repo.setDataSource(dataSource);
        PersonManager personManager = new PlainPersonManagerImpl(repo);
        /* End of setup */
        
        Person person = new Person("John", "Smith", "1980-04-03");
        // calling the Manager method
        int result = personManager.save(person);
        assertEquals(1, result);
    }

}
