package me.megumi.AC1.service;

import me.megumi.AC1.modelos.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task removeTask(int id);
}
