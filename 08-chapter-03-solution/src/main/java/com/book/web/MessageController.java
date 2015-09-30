package com.book.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iuliana.cosmina on 9/29/15.
 */
@RestController
public class MessageController {

    @Value("${app.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/message")
    public String message(){
        return message;
    }

}
