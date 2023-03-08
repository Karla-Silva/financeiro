package com.estacionamento.financeiro.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Deserializer;
import org.springframework.context.annotation.Configuration;
import com.estacionamento.financeiro.payloads.request.PagamentoClienteRequest;

import java.nio.charset.StandardCharsets;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class PagamentoClienteDeserializer implements Deserializer<PagamentoFornecedorRequest> {

    private final ObjectMapper objectMapper;

    @Override
    public PagamentoClienteRequest deserialize(String s, byte[] bytes) {
        log.info("Deserializando um objeto no tópico {}", s);
        String message = new String(bytes, StandardCharsets.UTF_8);
        try {
            return objectMapper.readValue(message, PagamentoClienteRequest.class);
        } catch (JsonProcessingException e) {
            log.error("Não foi possível converter a mensagem no objeto desejado");
            return null;
        }

    }

    public PagamentoClienteDeserializer(){
        this.objectMapper = new ObjectMapper();
    }
}
