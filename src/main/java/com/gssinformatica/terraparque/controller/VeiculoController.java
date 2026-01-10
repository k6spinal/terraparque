package com.gssinformatica.terraparque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gssinformatica.terraparque.model.Veiculo;
import com.gssinformatica.terraparque.repository.VeiculoRepository;

@RestController
@RequestMapping("/api/veiculo")
@CrossOrigin("*")
public class VeiculoController {
    
    @Autowired
    private VeiculoRepository repository;

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return repository.save(veiculo);
    }

    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }    

}
