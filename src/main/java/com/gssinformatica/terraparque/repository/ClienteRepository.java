package com.gssinformatica.terraparque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gssinformatica.terraparque.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
