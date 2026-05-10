package com.example.service;

import java.util.List;

import com.example.models.Tasks;

public interface TaskService {
	
	Tasks createTask(Tasks task);
	List<Tasks> getAllTasks();
	Tasks getTaskById(Long id);
	Tasks updateTask(Long id, Tasks task);
	Tasks markTaskCompleted(Long id);
	void deleteTask(Long id);
}
