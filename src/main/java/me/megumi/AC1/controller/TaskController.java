package me.megumi.AC1.controller;

import me.megumi.AC1.modelos.Task;
import me.megumi.AC1.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/add")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // Na configuração do endepoint é necessário adicionar entre chaves aonde ficará na url a variavel configurada abaixo
    @DeleteMapping("/remove/{id}")
    // A notação PathVariable permite que a API receba informações que estão contidas na URL
    public Task removeTask(@PathVariable int id) {
        return taskService.removeTask(id);
    }
}

