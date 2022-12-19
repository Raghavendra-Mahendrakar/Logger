package log.Example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {
	
	Logger logger=LoggerFactory.getLogger(Resource.class);
	
	@RequestMapping("/")
	public String home() {
		logger.error("error log");
		logger.trace("home method accessed");
		return "hello from SB";
	}
	
	@RequestMapping("/test/{name}")
	public String test(@PathVariable String name) {
		logger.debug("Request {}", name);
		String response="hi " + name +" welcome";
		logger.debug("Response {}",name);
		return response;
		
	}
}
