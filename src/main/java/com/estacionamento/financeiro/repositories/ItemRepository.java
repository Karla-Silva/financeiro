package com.estacionamento.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estacionamento.financeiro.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
