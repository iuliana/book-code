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
 * 
 * @author asarin
 *
 */
public class HelloWorldController implements Controller {
	/**
	 * action method.
	 */
	public void handleActionRequest(ActionRequest request,
			ActionResponse response) throws Exception {
		//-- do nothing the Hello World portlet doesn't receive
		//-- action requests.
	}
    
	/**
	 * render method.
	 */
	public ModelAndView handleRenderRequest(RenderRequest request,
			RenderResponse response) throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("helloWorldMessage", "Hello World from Spring WEB portlet example application!!");
		return new ModelAndView("helloWorld", model);
	}
}
