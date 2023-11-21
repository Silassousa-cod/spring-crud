package com.demo.services;

import com.demo.entities.Tarefa;
import com.demo.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * tarefa service implement.
 */
@Service
public class tarefaServiceImpl implements tarefaService {
     @Autowired
     private TarefaRepository tarefaRepository;

    

    @Override
    public List<Tarefa> listAlltarefas() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa gettarefaById(Integer id) {
        return tarefaRepository.findById(id).get();
    }

    @Override
    public Tarefa savetarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void deletetarefa(Integer id) {
        tarefaRepository.deleteById(id);
    }

}
