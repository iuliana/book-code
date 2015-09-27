package com.book.init;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 9/23/15.
 * Description: Class that depicts how port and contextPath can be set for a Spring Boot application.
 * In order to see this class in action, comment other customization classes annotations, decomment this and run the application.
 */

//@Component
public class CustomizationBean implements EmbeddedServletContainerCustomizer {
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8083);
        container.setContextPath("/boot");
    }
}


