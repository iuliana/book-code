package com.book.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iuliana.grajdeanu on 2/18/15.
 * Description: Simple configuration class for a Spring Web MVC application.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.ok.controllers"})
public class WebConfig extends WebMvcConfigurerAdapter {



    //Declare our static resources. I added cache to the java config but it’s not required.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations("/images/").setCachePeriod(31556926);
    }

    // <=> <mvc:default-servlet-handler/>
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("welcome");
    }

    @Bean
     InternalResourceViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp" );
        return resolver;
    }

    // Configures the +underline[contentNegotiationManager] bean
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer
                .ignoreAcceptHeader(true)
                .defaultContentType(MediaType.TEXT_HTML)
                .favorParameter(false)
                .favorPathExtension(true);

    }

    //Configure ContentNegotiatingViewResolver
    @Bean
    public ViewResolver contentNegotiatingViewResolver
    (ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);


        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<>();
        //resolvers.add(beanNameViewResolver());
        //resolvers.add(tilesViewResolver());
        //resolvers.add(+underline[jsonViewResolver]());
        //resolvers.add(excelViewResolver());
        resolver.setViewResolvers(resolvers);

        List<View> defaultViewList =  new ArrayList<>();
        //defaultViewList.add(jsonView);
        resolver.setDefaultViews(defaultViewList);

        resolver.setOrder(0);

        return resolver;
    }


    /*@Bean
    public MappingJackson2JsonView jsonView(){
        return new MappingJackson2JsonView();
    }*/

/*    @Bean
    public ViewResolver jsonViewResolver() {
        return new JsonViewResolver();
    }*/


   /* @Bean
    public MessageSource getMessageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/WEB-INF/messages/global");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }*/

}
