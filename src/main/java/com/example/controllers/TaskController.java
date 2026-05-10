package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Tasks;
import com.example.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService service;

	public TaskController(TaskService service) {
		this.service = service;
	}

	@PostMapping
	public Tasks createTask(@RequestBody Tasks task) {
		return service.createTask(task);
	}

	@GetMapping
	public List<Tasks> getAllTasks() {
		return service.getAllTasks();
	}

	@GetMapping("/{id}")
	public Tasks getTaskById(@PathVariable Long id) {
		return service.getTaskById(id);
	}

	@PutMapping("/{id}")
	public Tasks updateTask(@PathVariable Long id, @RequestBody Tasks task) {
		return service.updateTask(id, task);
	}

	@PatchMapping("/{id}/complete")
	public Tasks markComplete(@PathVariable Long id) {
		return service.markTaskCompleted(id);
	}

	@DeleteMapping("/{id}")
	public String deleteTask(@PathVariable Long id) {
		service.deleteTask(id);
		return "Task deleted successfully";
	}

}
