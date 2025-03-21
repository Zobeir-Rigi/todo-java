package com.example.todo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Get task by id
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    // Create new task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // Delete task
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    // Update task
    public Task updateTask(Long id, Task updatedTask) {
        if (taskRepository.existsById(id)) {
            updatedTask.setId(id);
            return taskRepository.save(updatedTask);
        } else {
            throw new RuntimeException("Task not found");
        }
    }
}
