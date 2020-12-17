package com.dil.conf.configserverRepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserverRepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverRepoApplication.class, args);
	}

}
