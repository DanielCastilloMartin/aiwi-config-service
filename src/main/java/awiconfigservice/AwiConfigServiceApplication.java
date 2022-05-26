package awiconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AwiConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwiConfigServiceApplication.class, args);
	}

}
