package com.demo.controllers;

import com.demo.entities.Tarefa;
import com.demo.services.tarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@RestController("/tarefa")
public class tarefaController {
     @Autowired
     private tarefaService tarefaService;

   @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("tarefas", tarefaService.listAlltarefas());
        System.out.println("Returning tarefas:");
        return "tarefas";
    }

    @GetMapping("/{id}")
    public String showtarefa(@PathVariable Integer id, Model model) {
        model.addAttribute("tarefa", tarefaService.gettarefaById(id));
        return "tarefashow";
    }

    @PutMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("tarefa", tarefaService.gettarefaById(id));
        return "tarefaform";
    }

    @RequestMapping("tarefa/new")
    public String newtarefa(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        return "tarefaform";
    }

    @RequestMapping(value = "tarefa", method = RequestMethod.POST)
    public String savetarefa(Tarefa tarefa) {
        tarefaService.savetarefa(tarefa);
        return "redirect:/tarefa/" + tarefa.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        tarefaService.deletetarefa(id);
        return "redirect:/tarefas";
    }

}
