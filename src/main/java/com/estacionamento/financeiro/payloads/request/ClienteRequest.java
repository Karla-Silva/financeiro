package com.estacionamento.financeiro.payloads.request;

import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;

@Data
public class ClienteRequest {

    private String cpf;
    private String nomeCliente;

    private String identificadorPlaca;
}
