package com.apress.todo.repository;

import com.apress.todo.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface TodoRepository
 *
 * @author Kseniya Dergunova
 * @since 10.12.2021
 */
public interface TodoRepository extends CrudRepository<ToDo, String> {
}
