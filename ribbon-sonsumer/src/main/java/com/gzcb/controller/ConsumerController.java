package com.gzcb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gcb on 2019/6/28.
 * 创建ConsumerController 类并实现/ribbon-consumer接口
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate ;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String helloConsumer(){

        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

}
