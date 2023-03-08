package com.estacionamento.financeiro.payloads.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class VagaRequest {
    @NotEmpty(message = "O identificador do produto é requerido")
    private String identificadorPlaca;
}
