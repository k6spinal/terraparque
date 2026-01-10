package com.gssinformatica.terraparque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gssinformatica.terraparque.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
