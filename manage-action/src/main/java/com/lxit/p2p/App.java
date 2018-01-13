package com.lxit.p2p;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.lxit.p2p.App;

@SpringBootApplication // 开启Spring Boot
@EnableEurekaClient // 开启Eureka配置
public class App {
	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}
}
