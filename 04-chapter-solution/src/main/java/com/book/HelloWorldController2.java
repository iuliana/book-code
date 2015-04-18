package com.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

import javax.portlet.*;
import java.io.IOException;


/**
 * Created by iuliana.cosmina on 4/18/15.
 */
@Controller("helloworld2")
@RequestMapping("VIEW")
public class HelloWorldController2 {

    @RenderMapping
    public String render(Model model){
        model.addAttribute("helloWorldMessage", "Hello World from Annotated Spring Portlet!!");
        return "helloWorld2";
    }

    /**
     * We do not need to do anything here. Just put this empty method here to give an example of action methods
     */
    @ActionMapping(value="doSomething")
    public void action(ActionRequest request, ActionResponse response){
    }

    /**
     * We do not need to do anything here. Just put this empty method here to give an example of resource request methods
     */
    @ResourceMapping(value = "loadSearchResults")
    public void loadSearchResults(ResourceRequest resourceRequest, ResourceResponse resourceResponse){
       // resourceResponse.getWriter().write(dataResponse);
    }

}
