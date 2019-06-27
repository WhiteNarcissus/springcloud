package com.gzcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


<<<<<<< HEAD
/**
 * 双节点 高可用注册中心  服务的发现
 * 节点1 peer1  端口：1111
 * 节点2 peer1  端口：1112
 * ip 为localhost
 */
=======
>>>>>>> 72d016151e8d516e90b9e78aa80c7815c856ac04
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
