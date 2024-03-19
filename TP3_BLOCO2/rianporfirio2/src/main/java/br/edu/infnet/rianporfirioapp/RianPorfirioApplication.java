package br.edu.infnet.rianporfirioapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RianPorfirioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RianPorfirioApplication.class, args);
	}

}
