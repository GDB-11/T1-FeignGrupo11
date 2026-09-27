package com.cibertec.pe.t1_feigngrupo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1Feigngrupo11Application {

	public static void main(String[] args) {
		SpringApplication.run(T1Feigngrupo11Application.class, args);
	}

}
