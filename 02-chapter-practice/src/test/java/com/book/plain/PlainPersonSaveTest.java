package com.book.plain;


import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonManager;
import com.book.plain.PlainPersonRepository;
import com.book.plain.PlainPersonManagerImpl;
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
        // TODO 1. Write necessary code to set up all needed in order to save a person
        /* End of setup */
        
        Person person = new Person("John", "Smith", "1980-04-03");
        // TODO 2. Call method to save the person instance and store the return value into the result variable
        int result = 0;
        assertEquals(1, result);
    }

}
