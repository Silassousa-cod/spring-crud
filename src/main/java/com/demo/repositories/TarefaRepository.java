package com.demo.repositories;

import com.demo.entities.Tarefa;
import org.springframework.data.jpa.repository.*;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
