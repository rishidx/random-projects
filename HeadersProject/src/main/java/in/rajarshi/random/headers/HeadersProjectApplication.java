package in.rajarshi.random.headers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class HeadersProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeadersProjectApplication.class, args);
		log.info("Application started !!!");
	}

}
