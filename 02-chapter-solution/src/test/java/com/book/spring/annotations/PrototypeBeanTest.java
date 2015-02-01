package com.book.spring.annotations;

import com.book.spring.components.PrototypeBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 1/17/15.
 */
public class PrototypeBeanTest {
    @Test
    public void testPrototype() {
        // Create the application from the configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/lc-app-config.xml", "classpath:spring/test-db-config.xml");
        PrototypeBean pb1 = (PrototypeBean)context.getBean("prototypeBean");
        assertNotNull(pb1);
        PrototypeBean pb2 = context.getBean(PrototypeBean.class);
        assertNotNull(pb2);
        assertNotEquals(pb1,pb2);
        assertEquals(PrototypeBean.instanceCounter(), 2);
    }
}
