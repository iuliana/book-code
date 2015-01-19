package com.book.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by iuliana.cosmina on 1/19/15.
 */
public class NotSoSimpleBean {
   
    @Autowired
    SimpleBean simpleBean;
    
  
    public NotSoSimpleBean(){
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }
}
