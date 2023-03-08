package com.estacionamento.financeiro.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cpf;
    private String identificadorPlaca;
    @Column(name = "nome_cliente")
    private String nomeCliente;

}
