package com.estacionamento.financeiro.payloads.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Data
public class ItemRequest {
    @NotNull
    private VagaRequest vaga;
    @Min(value = 1, message = "Informe um valor válido para o valor da vaga")
    private double preco;
    @Min(value = 1, message = "Informe o valor 1 para diária e 20 para mensalista")
    private int quantidade;
}
