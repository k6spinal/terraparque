package com.gssinformatica.terraparque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        saidaVeiculo.setEmTransito(true);
        return repository.save(saidaVeiculo);
    }

    @GetMapping
    public List<SaidaVeiculo> listar() {
        return repository.findAll();
    }   

    @PutMapping("/retorno/{id}")
    public ResponseEntity<?> registrarRetorno(
            @PathVariable Long id,
            @RequestBody SaidaVeiculo retorno) {

        SaidaVeiculo saida = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Saída não encontrada"));

        saida.setDataHoraRetorno(retorno.getDataHoraRetorno());
        saida.setVeiculoKmRetorno(retorno.getVeiculoKmRetorno());
        saida.setEmTransito(false);

        repository.save(saida);

        return ResponseEntity.ok().build();
    }  


    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }    
}
