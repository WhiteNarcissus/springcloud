package com.gzcb.controller;

import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.logging.Logger;

/**
 * Created by gcb on 2019/6/12.
 */

@RestController
public class HelloContronller {

    private final Logger  logger = Logger.getLogger(this.getClass().getName());


    private DiscoveryClient client ;


    @RequestMapping(value = "/hello")
    public  String index() {
        return  "Hello World" ;
    }





}
