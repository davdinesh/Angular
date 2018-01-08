package com.example.tasks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.tasks.domain.Task;
import com.example.tasks.repository.TaskRepository;
import com.example.tasks.service.TaskService;

import lombok.Setter;

@Component
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	@Setter private TaskRepository taskRepository;
	
	
	@Override
	public Iterable<Task> list() {
		return this.taskRepository.findAll();
	}


	@Override
	public Task save(Task task) {
		return this.taskRepository.save(task);
	}
	
	

}
