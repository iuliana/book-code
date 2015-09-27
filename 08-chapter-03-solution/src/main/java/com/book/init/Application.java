package com.book.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.book.init", "com.book.web"})
public class Application implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(app);
    }

    @Autowired
    @Qualifier("yamlConfigHolder")
    private YamlConfigHolder app;

    public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
    }

}
