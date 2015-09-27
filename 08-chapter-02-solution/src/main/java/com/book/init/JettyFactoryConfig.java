package com.book.init;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyServerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iuliana.cosmina on 9/27/15.
 * Description: Class that depicts how port and contextPath can be set for a Spring Boot application using a
 * JettyEmbeddedServletContainerFactory  bean.
 * In order to see this class in action, comment other customization classes annotations, decomment this and run the application.
 */
//@Configuration
public class JettyFactoryConfig {

   @Bean
    public JettyEmbeddedServletContainerFactory jettyServletContainerFactory(@Value("${server.port:8085}") final String port,
                                                                                     @Value("${jetty.threadPool.maxThreads:200}") final String maxThreads,
                                                                                     @Value("${jetty.threadPool.minThreads:8}") final String minThreads,
                                                                                     @Value("${jetty.threadPool.idleTimeout:60000}") final String idleTimeout) {
        final JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory(Integer.valueOf(port));
        factory.setContextPath("/boot");
        factory.addServerCustomizers(new JettyServerCustomizer() {
            @Override
            public void customize(final Server server) {
                // Customize the connection pool used by Jetty to handle incoming HTTP connections
                final QueuedThreadPool threadPool = server.getBean(QueuedThreadPool.class);
                threadPool.setMaxThreads(Integer.valueOf(maxThreads));
                threadPool.setMinThreads(Integer.valueOf(minThreads));
                threadPool.setIdleTimeout(Integer.valueOf(idleTimeout));
            }
        });
        return factory;
    }
}
