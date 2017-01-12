package com.book;

import java.util.HashMap;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.Controller;

/**
 * Spring controller which implements the Controller interface.
 */
public class HelloWorldController implements Controller {

    /**
     * Render method.
     */
    public ModelAndView handleRenderRequest(RenderRequest request,
                                            RenderResponse response) throws Exception {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("helloWorldMessage", "Hello World from Spring WEB portlet example application!!");
        return new ModelAndView("helloWorld", model);
    }

    /**
     * Action method.
     */
    public void handleActionRequest(ActionRequest request,
                                    ActionResponse response) throws Exception {
        //we do not have action requests
    }

}
