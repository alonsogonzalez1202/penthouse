package com.laurrabaquio.penthouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(
				1,
				"Enrique",
				"enrique.laurrabaquyio@gmail.com",
				LocalDate.of(2020, Month.APRIL, 1),
				Short.valueOf("37")
				));
	}

}
