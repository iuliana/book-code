package com.book.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by iuliana.cosmina on 9/27/15.
 */
//@Component
//@DependsOn("yamlConfigHolder")
public class YamlConfBean implements EmbeddedServletContainerCustomizer {

    @Autowired
    @Qualifier("yamlConfigHolder")
    private YamlConfigHolder app;

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(app.getPort());
        container.setContextPath(app.getContext());
    }
}

