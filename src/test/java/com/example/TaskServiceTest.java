package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.models.Tasks;
import com.example.service.TaskService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

	@Autowired
	TaskService service;

	@Test
	void createTaskTest() {
		Tasks task = new Tasks();
		task.setTitle("Learn Spring Boot");

		Tasks saved = service.createTask(task);

		assertNotNull(saved.getId());
		assertEquals("Learn Spring Boot", saved.getTitle());
	}
}