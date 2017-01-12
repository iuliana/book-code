package com.book.spring.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

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
    private void postConstruct(){
        logger.info("3. @PostConstruct.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("4. afterPropertiesSet.");
    }

    private void initMethod(){
        logger.info("5. init-method.");
    }

    @PreDestroy
    protected void preDestroy(){
        logger.info("6. @PreDestroy.");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("7. destroy.");
    }

    protected void destroyMethod() throws Exception {
        logger.info("8. destroy-method.");
    }

}
