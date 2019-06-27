package com.gzcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by gcb on 2019/6/13.
<<<<<<< HEAD
 *  第一个服务 hello - service
=======
>>>>>>> 72d016151e8d516e90b9e78aa80c7815c856ac04
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServer1Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer1Application.class, args);
    }

}