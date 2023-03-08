package com.estacionamento.financeiro.queue.in;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.estacionamento.financeiro.payloads.request.PagamentoClienteRequest;
import com.estacionamento.financeiro.servico.SalvarPagamentoService;

@Component
@RequiredArgsConstructor
public class PagamentoClienteMessageConsumer {
    private final ObjectMapper objectMapper;
    private final SalvarPagamentoService pagamentoService;
    @RabbitListener(queues = {"${business.message.queue.pagamento_cliente}"})
    public void receiveMessage(String message) throws JsonProcessingException {
        PagamentoClienteRequest pagamentoClienteRequest = objectMapper.readValue(message, PagamentoClienteRequest.class);
        pagamentoService.execute(pagamentoClienteRequest);
    }
}
