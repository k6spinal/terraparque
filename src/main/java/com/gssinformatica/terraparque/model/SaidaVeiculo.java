package com.gssinformatica.terraparque.model;

import java.time.LocalDateTime;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "saidaVeiculo")
public class SaidaVeiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaboradorId", nullable = false)
    private Colaborador colaborador;

    @ManyToOne
    @JoinColumn(name = "veiculoId", nullable = false)
    private Veiculo veiculo;

    @Column(nullable = false, length = 100)
    private String veiculoKm;

    @Column(nullable = false, length = 100)
    private String motivoSaida;

    @Column(nullable = false, length = 500)
    private String observacoes;

    @Column(nullable = false)
    private Date dataHoraSaida;

    private LocalDateTime dataHoraRetorno;

    private Long veiculoKmRetorno;

    private Boolean emTransito;




    public SaidaVeiculo() {
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getDataHoraRetorno() {
        return dataHoraRetorno;
    }


    public void setDataHoraRetorno(LocalDateTime dataHoraRetorno) {
        this.dataHoraRetorno = dataHoraRetorno;
    }

    public Long getVeiculoKmRetorno() {
        return veiculoKmRetorno;
    }

    public void setVeiculoKmRetorno(Long veiculoKmRetorno) {
        this.veiculoKmRetorno = veiculoKmRetorno;
    }

    public Boolean getEmTransito() {
        return emTransito;
    }

    public void setEmTransito(Boolean emTransito) {
        this.emTransito = emTransito;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    

    


}