package com.example.tasks;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.tasks.domain.Task;
import com.example.tasks.service.TaskService;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner (TaskService taskService) {
		return args -> {
			taskService.save(new Task(1L, "Task 1", LocalDate.now(), true));
		};
	}
}
