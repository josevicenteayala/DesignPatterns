package com.pattern.spring;

import com.pattern.spring.creational.prototype.ProtoFalse;
import com.pattern.spring.creational.prototype.ProtoTrue;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringPatterns {

	public static void main(String[] args) {
		SpringApplication.run(SpringPatterns.class, args);
	}

	@Bean
	public ProtoFalse protoFalse(){
		return new ProtoFalse();
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ProtoTrue protoTrue(){
		return new ProtoTrue();
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
