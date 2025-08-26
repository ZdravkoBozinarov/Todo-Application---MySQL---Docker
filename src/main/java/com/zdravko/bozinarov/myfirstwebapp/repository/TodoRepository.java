package com.zdravko.bozinarov.myfirstwebapp.repository;

import com.zdravko.bozinarov.myfirstwebapp.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    public List<Todo> findByUsername(String username);

}
