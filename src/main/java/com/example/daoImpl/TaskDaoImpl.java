package com.example.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.dao.TaskDao;
import com.example.models.Tasks;

@Repository
public class TaskDaoImpl implements TaskDao {
	private final Map<Long, Tasks> db = new HashMap<>();
	private Long counter = 1L;

	public Tasks save(Tasks task) {
		if (task.getId() == null) {
			task.setId(counter++);
		}
		db.put(task.getId(), task);
		return task;
	}

	public List<Tasks> findAll() {
		return new ArrayList<>(db.values());
	}

	public Optional<Tasks> findById(Long id) {
		return Optional.ofNullable(db.get(id));
	}

	public void delete(Long id) {
		db.remove(id);
	}
}
