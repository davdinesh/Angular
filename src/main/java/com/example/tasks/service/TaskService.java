/**
 * 
 */
package com.example.tasks.service;

import org.springframework.stereotype.Service;

import com.example.tasks.domain.Task;

/**
 * @author viswa
 *
 */
@Service
public interface TaskService {
	
	public Iterable<Task> list();
	
	public Task save(Task task);

}
