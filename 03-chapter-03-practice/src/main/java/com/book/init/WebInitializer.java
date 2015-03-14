package com.book.init;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by iuliana.cosmina on 3/14/15.
 */
public class WebInitializer /* TODO 14. Add Spring Specific interface needed  in Servlet 3.0+ environments
in order to configure the ServletContext programmatically */ {

    //DE-comment this line after adding the proper interface
    //@Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        /* TODO 15. Add dispatcher servlet parameter needed in order to provide Spring MVC configuration */
    }
}
