package com.book.spring.annotations;

import com.book.base.Person;
import com.book.base.PersonManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Test class exemplifying how to save a person with Spring using annotation configuration.
 * The environment is bootstrapped using an AnnotationConfigApplicationContext which is automatically created because of the
 * @ContextConfiguration(classes = {AppConfig.class}) annotation setting of the Test class.
 * Observation: This is a typical annotated test class, one of the most simple way to test your code using Spring Test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class SecondAnnotationPersonSaveTest {

    @Autowired
    PersonManager personManager;

    @Test
    public void savePerson() {
        // Use the Manager
        Person person = new Person("John", "Smith", "1980-04-03");
        int result = personManager.save(person);
        assertEquals(1, result);
    }
}
