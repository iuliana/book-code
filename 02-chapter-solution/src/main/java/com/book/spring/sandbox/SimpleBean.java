package com.book.spring.sandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by iuliana.cosmina on 1/19/15.
 */
public class SimpleBean {

    private Logger logger = LoggerFactory.getLogger(SimpleBean.class);

    private String identifier;

    public SimpleBean(){
        identifier = System.currentTimeMillis() +"";
        logger.info("-> Instance identifier: " + identifier);
    }

    public String getIdentifier() {
        return identifier;
    }
}
