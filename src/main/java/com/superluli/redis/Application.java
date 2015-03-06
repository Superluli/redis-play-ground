package com.superluli.redis;

import org.springframework.boot.SpringApplication;

public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApplicationConfiguration.class);
		app.setShowBanner(false);
		app.run(args);
	}
}
