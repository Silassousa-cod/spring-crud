package com.demo.services;

import com.demo.entities.Tarefa;

import java.util.List;

public interface tarefaService {

    List<Tarefa> listAlltarefas();

    Tarefa gettarefaById(Integer id);

    Tarefa savetarefa(Tarefa tarefa);

    void deletetarefa(Integer id);

}
