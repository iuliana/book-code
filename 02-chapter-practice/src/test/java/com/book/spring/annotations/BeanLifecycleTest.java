package com.book.spring.annotations;

import com.book.spring.components.CompleteLivingBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 1/17/15.
 * Description: Tests class used to display the lifecycle of a bean
 */

public class BeanLifecycleTest {
    @Test
    public void showLifcycle() {
        // Create the application from the configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/lc-app-config.xml", "classpath:spring/test-db-config.xml");
        CompleteLivingBean bean = context.getBean("livingBean", CompleteLivingBean.class);
        assertNotNull(bean);

        //Register a shutdown hook with the JVM runtime, closing this context
        //on JVM shutdown unless it has already been closed at that time.
        // We are calling it in order to see the destroy methods being executed.
        context.registerShutdownHook();
    }

}
