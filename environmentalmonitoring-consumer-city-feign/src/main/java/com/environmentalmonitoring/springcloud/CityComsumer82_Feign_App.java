package com.environmentalmonitoring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class CityComsumer82_Feign_App {
public static void main(String[] args) throws Exception {
	SpringApplication.run(CityComsumer82_Feign_App.class, args);
}

}
