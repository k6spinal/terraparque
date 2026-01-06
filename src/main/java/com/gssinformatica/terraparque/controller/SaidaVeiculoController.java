package com.gssinformatica.terraparque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gssinformatica.terraparque.model.SaidaVeiculo;
import com.gssinformatica.terraparque.repository.SaidaVeiculoRepository;


@RestController
@RequestMapping("/api/saidaveiculos")
@CrossOrigin("*")
public class SaidaVeiculoController {
    
    
    @Autowired
    private SaidaVeiculoRepository repository;

    @PostMapping
    public SaidaVeiculo salvar(@RequestBody SaidaVeiculo saidaVeiculo) {
        return repository.save(saidaVeiculo);
    }

    @GetMapping
    public List<SaidaVeiculo> listar() {
        return repository.findAll();
    }   

}
