package com.estacionamento.financeiro.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.estacionamento.financeiro.payloads.request.PagamentoClienteRequest;
import com.estacionamento.financeiro.payloads.response.RelatorioCliente;
import com.estacionamento.financeiro.servico.SalvarPagamentoService;
import com.estacionamento.financeiro.servico.SomaPedidosPorClienteService;

@RestController
@RequestMapping("/pagamento")
@RequiredArgsConstructor
@Slf4j
public class PagamentosController {

    private final SalvarPagamentoService salvarPagamentoService;
    private final SomaPedidosPorClienteService somaPedidosPorClienteService;
    @PostMapping(path = "/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public void realizarPagamentoCliente(@RequestBody PagamentoClienteRequest pagamentoClienteRequest){
        log.info("Requisição de pagamento recebido {}",pagamentoClienteRequest);
        salvarPagamentoService.execute(pagamentoClienteRequest);
    }

    @GetMapping(path = "/relatorio/{idCliente}")
    public RelatorioCliente getRelatorioCliente(@PathVariable String idCliente){
        return somaPedidosPorClienteService.execute(idCliente);
    }
}
