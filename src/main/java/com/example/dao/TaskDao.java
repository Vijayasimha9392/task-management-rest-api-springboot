package com.example.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.models.Tasks;

@Repository
public interface TaskDao {
	
	Tasks save(Tasks task);
	List<Tasks> findAll();
	Optional<Tasks> findById(Long id);
	void delete(Long id);
}
