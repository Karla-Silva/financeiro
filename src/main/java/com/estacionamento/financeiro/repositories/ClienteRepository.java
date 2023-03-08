package com.estacionamento.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estacionamento.financeiro.entities.Cliente;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByIdentificadorPlaca(String identificadorPlaca);
}
