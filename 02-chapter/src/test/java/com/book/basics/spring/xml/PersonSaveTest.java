package com.book.basics.spring.xml;

import com.book.basics.Person;
import com.book.spring.annotations.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by iuliana.cosmina on 1/11/15.
 */
public class PersonSaveTest {

    @Test
    public void savePerson() {
        // Create the application from the configuration
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("classpath:spring/application-config.xml", 
                        "classpath:spring/db-config.xml");
        // Look up the application service interface
        PersonService service = context.getBean("personService", PersonService.class);
        // Use the service
        service.save(new Person("John", "Smith", "1980-04-13"));
    }

}
