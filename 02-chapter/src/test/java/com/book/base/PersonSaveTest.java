package com.book.base;

import com.book.JdbcPersonRepository;
import com.book.PersonServiceImpl;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with pure Java.
 */
public class PersonSaveTest {

    @Test
    public void savePerson() {
        /* Start of setup*/
        PersonRepository repo = new JdbcPersonRepository();
        DataSource dataSource = new BasicDataSource();
        repo.setDataSource(dataSource);
        PersonService personService = new PersonServiceImpl(repo);
        /* End of setup */
        
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = personService.save(person);
        assertEquals(0, result);
    }

}
