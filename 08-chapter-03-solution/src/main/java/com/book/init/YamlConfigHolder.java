package com.book.init;

/**
 * Created by iuliana.cosmina on 9/27/15.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="app")
public class YamlConfigHolder {
    private static Logger logger = LoggerFactory.getLogger(YamlConfigHolder.class);

    private Integer port;
    private String context;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public YamlConfigHolder() {
    }

    @PostConstruct
    public void check() {
        logger.info("Initialized [{}] [{}]", port, context);
    }
}