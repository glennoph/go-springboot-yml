package go.springboot.yml;

import lombok.Value;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Log4j2

public class GoSpringbootYmlApplication implements CommandLineRunner {

	//private ApplicationConfig config;

//	public GoSpringbootYmlApplication(ApplicationConfig ymlConfig) {
//		this.config = ymlConfig;
//	}

	public static void main(String[] args) {
		SpringApplication.run(GoSpringbootYmlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				log.info("message from application.properties " +
						environment.getProperty("message-from-application-properties"));
			}
		};
	}


	@Override
	public void run(String... args) throws Exception {

//		log.info("environment: {}", config.getEnvironment());
//		log.info("name: {}", config.getName());
//		log.info("enabled: {}", config.isEnabled());
//
//		log.info("servers: {}", config.getServers());
	}
}
