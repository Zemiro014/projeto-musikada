package com.musikada.ciphers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MusikadaCiphersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusikadaCiphersApplication.class, args);
	}
}
