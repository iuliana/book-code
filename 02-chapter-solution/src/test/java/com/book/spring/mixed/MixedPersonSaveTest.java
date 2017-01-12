package com.book.spring.mixed;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with Spring using a mixed configuration.
 * The XML configuration file mixed-app-config.xml contains Spring specific configuration which enables
 * annotated classes discovery.
 * The environment is bootstrapped using a ClassPathXmlApplicationContext instance.
 */
public class MixedPersonSaveTest {

    @Test
    public void savePerson() {
        // Create the application from the configuration
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/mixed-app-config.xml",
                        "classpath:spring/test-db-config.xml");
        // Look up the application Manager interface
        PersonManager personManager = context.getBean("personManager", PersonManager.class);
        // Use the Manager
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = personManager.save(person);
        assertEquals(1, result);
    }
}
