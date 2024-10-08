package co.istad.springcloudconfigservervault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerVaultApplication.class, args);
	}

}
