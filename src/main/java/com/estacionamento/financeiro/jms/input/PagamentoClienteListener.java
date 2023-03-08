package com.estacionamento.financeiro.jms.input;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.payloads.request.PagamentoClienteRequest;
import com.estacionamento.financeiro.servico.SalvarPagamentoService;

@Service
@RequiredArgsConstructor
@Slf4j
public class PagamentoClienteListener {

    private final SalvarPagamentoService salvarPagamentoService;

    @KafkaListener(topics = "${business.mensagem.entrada.pagamento_cliente}", groupId = "${spring.kafka.consumer.group-id}")
    public void receive(PagamentoClienteRequest request){
        log.info("Recebendo uma nova requisição para receber pagameno do cliente {}", request);
        salvarPagamentoService.execute(request);
    }
}
