package com.gzcb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 *Ribbon 服务的消费
 *是一个基于 HTTP 和 TCP 客户端负载均衡器
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonSonsumerApplication {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}


	public static void main(String[] args) {
		SpringApplication.run(RibbonSonsumerApplication.class, args);
	}




}
