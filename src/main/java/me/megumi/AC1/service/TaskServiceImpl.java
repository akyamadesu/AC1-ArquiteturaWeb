package me.megumi.AC1.service;

import lombok.RequiredArgsConstructor;
import me.megumi.AC1.modelos.Task;
import me.megumi.AC1.modelos.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    /*
    Não é necessário graças a notação
     */
//    public TaskServiceImpl(TaskRepository taskRepository) {
//        this.taskRepository = taskRepository;
//    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task removeTask(int id) {
        return null;
    }

    @Override
    public void removeTask(Long id) {
        // Recuperar para verificar se o dado realmente existe
        Task task = getTaskById(id);
        // Se não existe, lançamos uma exceção para que seja capturada no controller de forma que o erro seja exibido na resposta
        if (task == null)
            System.out.println("Erro");

        taskRepository.deleteById(id);
    }
}