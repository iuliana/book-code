package com.book.spring.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 1/17/15.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    private Logger logger = LoggerFactory.getLogger(PrototypeBean.class);
    private static int instanceCounter = 0;

    public PrototypeBean() {
        logger.info("-> Constructing instance no: " + (++instanceCounter));
    }

    public static int instanceCounter(){
        return instanceCounter;
    }
}
