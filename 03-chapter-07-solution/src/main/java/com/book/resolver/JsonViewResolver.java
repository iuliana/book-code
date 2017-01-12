package com.book.resolver;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.util.Locale;

/**
 * Created by iuliana.cosmina on 3/21/15.
 */
public class JsonViewResolver implements ViewResolver, Ordered {

    private int order;

    @Override
    public View resolveViewName(String viewName, Locale locale)
            throws Exception {
        MappingJackson2JsonView view = new MappingJackson2JsonView();
        //make JSON output readable
        view.setPrettyPrint(true);
        return view;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }
}
