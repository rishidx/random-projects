package in.rajarshi.random.headers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HeadersController {

	@GetMapping("/hello")
	public String printHello(@RequestHeader(required = true) @NotEmpty String randomHeader) {
		log.info(randomHeader);
		return "Hello World";
	}
}
