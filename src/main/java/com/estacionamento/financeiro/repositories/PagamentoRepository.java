package com.estacionamento.financeiro.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.estacionamento.financeiro.entities.Pagamento;

import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    @EntityGraph(value = "Pagamento.items")
    //@Query("Select p from Pagamento p join p.fornecedor f join p.items i where f.identificador = :identificador ")

    List<Pagamento> findByClienteIdentificadorPlaca(String identificadorClientePlaca);
}
