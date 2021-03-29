package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HsEsslingenHelloApplication {

	private String state = "no_state";

	@GetMapping("/")
	public String sayHello(){
		return "Hello Sindelfingen, SoSe 2021 ("+state+")";
	}

	@GetMapping("/otherEndpoint")
	public String sayHelloAgain(){

		return "otherEndpoint: Hello Sindelfingen, SoSe 2021";
	}

	@PostMapping("/postSomething/{stringParam}")
	public String saySomething(@PathVariable String stringParam){
		state = stringParam;
		return "hello "+ stringParam;
	}

	public static void main(String[] args) {
		SpringApplication.run(HsEsslingenHelloApplication.class, args);
	}

}
