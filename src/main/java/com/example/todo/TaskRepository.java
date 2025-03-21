package com.example.todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Custom query methods can be added here if needed
}
