package com.estacionamento.financeiro.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Vaga")
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String identificadorPlaca;
}
