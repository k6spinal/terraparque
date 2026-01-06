package com.gssinformatica.terraparque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gssinformatica.terraparque.model.Colaborador;
import com.gssinformatica.terraparque.repository.ColaboradorRepository;


@RestController
@RequestMapping("/api/colaborador")
@CrossOrigin("*")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository repository;

    @PostMapping
    public Colaborador salvar(@RequestBody Colaborador colaborador) {
        return repository.save(colaborador);
    }

    @GetMapping
    public List<Colaborador> listar() {
        return repository.findAll();
    }    
    
}
