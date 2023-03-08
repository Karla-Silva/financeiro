package com.estacionamento.financeiro.payloads.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PagamentoClienteRequest {
    @NotNull
    private ClienteRequest cliente;

    @NotNull
    private List<ItemRequest> items;

}
