package com.parent.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.config.Contant;

/**
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**auth : szy
 *time : 2019-12-20
 **/
@RestController
public class Hello {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String index(@PathVariable("name") String name) {
        System.out.println("hello/{name}--{name} is "+ name+"application="+ Contant.APPLICATION_NAME);
        return "hello";
    }
}
