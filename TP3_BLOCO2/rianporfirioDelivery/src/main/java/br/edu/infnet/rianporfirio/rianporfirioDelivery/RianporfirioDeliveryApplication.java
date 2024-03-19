package br.edu.infnet.rianporfirio.rianporfirioDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RianporfirioDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RianporfirioDeliveryApplication.class, args);
	}

}
