package com.webs_consumer_redBus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WebsConsumerRedBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsConsumerRedBusApplication.class, args);
	}
	
	@Bean
	public RestTemplate rt() 
	{
		RestTemplate rt = new RestTemplate();
		return rt;
		
	}

}
