package com.msnithilan.emailreplygenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmailReplyGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailReplyGeneratorApplication.class, args);
	}

}
