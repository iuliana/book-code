package com.book.pojos;


import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 */
public class PersonSaveTest {

    @Test
    public void savePerson() {
        PersonRepository repo = new JdbcPersonRepository();

        DataSource dataSource = new BasicDataSource();
        repo.setDataSource(dataSource);
        PersonService personService = new PersonServiceImpl(repo);
        Person person = new Person("John", "Smith", "1980-04-03");
        // set fields values
        personService.save(person);
    }

}
