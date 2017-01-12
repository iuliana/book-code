package com.book.spring.annotations;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/14/15.
 * Description: Test class exemplifying how to save a person with Spring using annotation configuration.
 * The environment is bootstrapped using an AnnotationConfigApplicationContext.(manually)
 */
public class FirstAnnotationPersonSaveTest {

    @Test
    public void savePerson() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        // Look up the application Manager interface
        PersonManager Manager = (PersonManager) context.getBean("personManager");
        // Use the Manager
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = Manager.save(person);
        assertEquals(1, result);
    }
}
