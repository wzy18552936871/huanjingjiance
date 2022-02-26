package com.environmentalmonitoring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
@SpringBootApplication
@EnableEurekaClient
@EnableScheduling
public class CityProvider8002_App {

public static void main(String[] args) throws Exception {
	SpringApplication.run(CityProvider8002_App.class, args);
}

}
