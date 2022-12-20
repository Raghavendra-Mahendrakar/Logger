package log.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class LogApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogApplication.class, args);
	}

	Logger logger = LoggerFactory.getLogger(LogApplication.class);

	@RequestMapping("/")
	public String home() {
		logger.error("error log");
		logger.trace("home method accessed");
		return "hello from SB";
	}

	@RequestMapping("/test/{name}")
	public String test(@PathVariable String name) {
		logger.debug("Request {}", name);
		String response = "hi " + name + " welcome";
		logger.debug("Response {}", name);
		return response;

	}
}
