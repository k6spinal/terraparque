package com.gssinformatica.terraparque.model;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "saidaVeiculo")
public class SaidaVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nomeMotorista;

    @Column(nullable = false, length = 100)
    private String veiculoPlaca;

    @Column(nullable = false, length = 100)
    private String veiculoKm;

    @Column(nullable = false, length = 100)
    private String motivoSaida;

    @Column(nullable = false, length = 500)
    private String observacoes;

    @Column(nullable = false)
    private Date dataHoraSaida;

   // @Column(nullable = false)
   // private boolean retorna;

    public SaidaVeiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getVeiculoPlaca() {
        return veiculoPlaca;
    }

    public void setVeiculoPlaca(String veiculoPlaca) {
        this.veiculoPlaca = veiculoPlaca;
    }

    public String getVeiculoKm() {
        return veiculoKm;
    }

    public void setVeiculoKm(String veiculoKm) {
        this.veiculoKm = veiculoKm;
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(Date dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }



    


}