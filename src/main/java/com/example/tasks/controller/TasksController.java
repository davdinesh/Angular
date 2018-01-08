package com.example.tasks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tasks.domain.Task;
import com.example.tasks.service.TaskService;

import lombok.Setter;

@RestController
@RequestMapping("/api/tasks")
public class TasksController {
	
	@Autowired
	@Setter private TaskService taskService;
	
	@GetMapping(value = {"", "/"})
	public Iterable<Task> list() {
		return taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}

}
