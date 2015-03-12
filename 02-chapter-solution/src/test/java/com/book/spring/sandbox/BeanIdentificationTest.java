package com.book.spring.sandbox;

import org.junit.Test;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by iuliana.cosmina on 1/19/15.
 * Description: Test class used to exemplify bean identification
 */
public class BeanIdentificationTest {
    @Test
    public void getInfrastructureBean1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/sandbox/test-bean-identification-cfg-01.xml");
        AutowiredAnnotationBeanPostProcessor proc =  context.getBean(AutowiredAnnotationBeanPostProcessor.class);
        assertNotNull(proc);
    }

    @Test
    public void getInfrastructureBean2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/sandbox/test-bean-identification-cfg-02.xml");
        AutowiredAnnotationBeanPostProcessor proc =  context.getBean(AutowiredAnnotationBeanPostProcessor.class);
        assertNotNull(proc);
    }


    @Test
    public void getSimpleBeanByType() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/sandbox/test-bean-identification-cfg-03.xml");
        SimpleBean sb = context.getBean(SimpleBean.class);
        NotSoSimpleBean cb = context.getBean(NotSoSimpleBean.class);
        assertNotNull(sb);
        assertNotNull(cb);
        assertEquals(sb, cb.getSimpleBean());
    }

    @Test
    public void getSimpleBeansByNameAndId() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/sandbox/test-bean-identification-cfg-04.xml");
        //SimpleBean sb0 = context.getBean("sb0",SimpleBean.class);
        SimpleBean sb0 = (SimpleBean)context.getBean("sb0");
        assertNotNull(sb0);

        SimpleBean sb = context.getBean("sb1",SimpleBean.class);
        SimpleBean sbb1 = context.getBean("sbb1",SimpleBean.class);
        SimpleBean sbbb1 = context.getBean("sbbb1",SimpleBean.class);

        assertEquals(sb, sbb1);
        assertEquals(sbb1, sbbb1);
    }

    @Test
    public void testBeans() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:spring/sandbox/test-bean-identification-cfg-04.xml");
        SimpleBean sb01 = context.getBean("sb01", SimpleBean.class);
        SimpleBean sb02 = context.getBean("id01", SimpleBean.class);
        assertTrue(sb01 == sb02);
    }

}
