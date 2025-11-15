package microservices.hotel.config_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@Slf4j
public class ConfigServiceApplication {
    public static void main(String[] args) {
        log.info("Application started");
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
