package com.estacionamento.financeiro.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double preco;

    private int quantidade;
    //diária = 1, mensal = 20

    @ManyToOne
    @JoinColumn(name = "id_vaga")
    private Vaga vaga;

    @ManyToOne
    @JoinColumn(name = "id_pagamento")
    private Pagamento pagamento;
}
