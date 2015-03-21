package com.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
@Controller
public class WelcomeController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
                                                 HttpServletResponse arg1) throws Exception {
        ModelAndView model = new ModelAndView("welcome");
        model.addObject("message", "Hello to you!");
        return model;
    }
}
