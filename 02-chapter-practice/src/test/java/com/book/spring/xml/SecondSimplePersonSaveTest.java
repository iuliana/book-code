package com.book.spring.xml;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with Spring using an XML configuration.
 * The environment is bootstrapped using a ClassPathXmlApplicationContext instance.
 * The beans used here are POJO instances from package com.book.plain
 * Two configuration files are used, which can be found under spring/another,
 * because the database configuration is separate.
 */
public class SecondSimplePersonSaveTest {


    @Test
    public void savePerson() {
        // Create the application from the configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext(/* TODO 4. Add here the necessary files to create a proper context.*/);
        // Look up the application Manager interface
        PersonManager personManager = context.getBean("personManager", PersonManager.class);
        // Use the Manager
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = personManager.save(person);
        assertEquals(1, result);
    }
}
