package com.estacionamento.financeiro.servico;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.entities.Cliente;
import com.estacionamento.financeiro.repositories.ClienteRepository;

@Service
@RequiredArgsConstructor
public class RetrieveOrSaveClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente execute(Cliente cliente){
        return clienteRepository.findByIdentificadorPlaca(cliente.getIdentificador())
                .orElse(clienteRepository.save(cliente));
    }
}
