package com.example.sigorta_gecmisi_servisi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.sigorta_gecmisi_servisi.client")
public class SigortaGecmisiServisiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigortaGecmisiServisiApplication.class, args);
	}

}
