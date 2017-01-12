package com.book.spring.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by iuliana.cosmina on 1/17/15.
 */
public class CompleteLivingBean  implements InitializingBean, DisposableBean {

    private Logger logger = LoggerFactory.getLogger(CompleteLivingBean.class);

    public String internal;

    public CompleteLivingBean() {
        logger.info("1. Constructor.");
    }

    public void setInternal(String internal) {
        logger.info("2. Setter.");
        this.internal = internal;
    }

    @PostConstruct
    public void postConstruct(){
        logger.info("3. @PostConstruct.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("4. afterPropertiesSet.");
    }

    public void initMethod(){
        logger.info("5. init-method.");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("1. @PreDestroy.");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("2. destroy.");
    }

    public void destroyMethod() throws Exception {
        logger.info("3. destroy-method.");
    }

}
