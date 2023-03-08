package com.estacionamento.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ada.exemplos.salao.beleza.entities.Produto;

import java.util.Optional;

public interface VagaRepository  extends JpaRepository<Vaga, Long> {
    Optional<Vaga> findByIdentificadorPlaca(String identificadorPlaca);
}
