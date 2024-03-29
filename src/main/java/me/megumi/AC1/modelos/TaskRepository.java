package me.megumi.AC1.modelos;

import java.util.List;

public interface TaskRepository {

    List<Task> findAll();

    Task findById(Long id);

    Task save(Task task);

    Task delete(int id);
}