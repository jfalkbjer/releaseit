package com.example.releaseit;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@SpringBootApplication
public class ReleaseitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleaseitApplication.class, args);
	}

	@RestController
	public class ReleaseitRestController {

		@GetMapping("/hello")
		public Map<String, String> sayHello(@RequestParam(defaultValue = "World") String name) {
			return Map.of("message", "Hello " + name);
		}

	}

}
