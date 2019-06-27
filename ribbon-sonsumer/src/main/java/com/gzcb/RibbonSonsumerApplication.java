package com.gzcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *Ribbon 服务的消费
 *是一个基于 HTTP 和 TCP 客户端负载均衡器
 *
 */

@SpringBootApplication
public class RibbonSonsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonSonsumerApplication.class, args);
	}

}
