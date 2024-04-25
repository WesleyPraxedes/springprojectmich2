package com.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("senha123"));
	}	
	
	@GetMapping("/")
	public String index(){
		return "Olá Mundo - Parking Control!";
	}

}
