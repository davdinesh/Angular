/**
 * 
 */
package com.example.tasks.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.tasks.domain.Task;

/**
 * @author viswa
 *
 */
public interface TaskRepository extends CrudRepository<Task, Long>{

}
