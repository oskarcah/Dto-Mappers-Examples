package com.globant.training.sampledto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.globant.training.sampledto"})
@EntityScan({"com.globant.training.sampledto"})
public class SampleDtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDtoApplication.class, args);
	}

}
