package go.springboot.yml;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
//@Log4j2
//@Log fail
public class GoSpringbootYmlApplication implements CommandLineRunner {

	private ApplicationConfig config;

	public GoSpringbootYmlApplication(ApplicationConfig ymlConfig) {
		this.config = ymlConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(GoSpringbootYmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("environment: " + config.getEnvironment());
//		System.out.println("name: " + config.getName());
//		System.out.println("enabled: "+ config.isEnabled());
		log.info("environment: {}", config.getEnvironment());
		log.info("name: {}", config.getName());
		log.info("enabled: {}", config.isEnabled());

		log.info("servers: {}", config.getServers());
	}
}
