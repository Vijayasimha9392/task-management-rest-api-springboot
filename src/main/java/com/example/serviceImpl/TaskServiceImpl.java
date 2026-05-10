package com.example.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.TaskDao;
import com.example.exception.ResourceNotFoundException;
import com.example.models.TaskStatus;
import com.example.models.Tasks;
import com.example.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	private final TaskDao dao;

	public TaskServiceImpl(TaskDao dao) {
		this.dao = dao;
	}

	public Tasks createTask(Tasks task) {
		task.setStatus(TaskStatus.PENDING);
		task.setCreatedAt(LocalDateTime.now());
		task.setUpdatedAt(LocalDateTime.now());
		return dao.save(task);
	}

	public List<Tasks> getAllTasks() {
		return dao.findAll();
	}

	public Tasks getTaskById(Long id) {
		return dao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Task not found"));
	}

	public Tasks updateTask(Long id, Tasks task) {
		Tasks existing = getTaskById(id);

		existing.setTitle(task.getTitle());
		existing.setDescription(task.getDescription());
		existing.setDueDate(task.getDueDate());
		existing.setStatus(task.getStatus());
		existing.setUpdatedAt(LocalDateTime.now());

		return dao.save(existing);
	}

	public Tasks markTaskCompleted(Long id) {
		Tasks task = getTaskById(id);
		task.setStatus(TaskStatus.COMPLETED);
		task.setUpdatedAt(LocalDateTime.now());
		return dao.save(task);
	}

	public void deleteTask(Long id) {
		getTaskById(id);
		dao.delete(id);
	}

}
