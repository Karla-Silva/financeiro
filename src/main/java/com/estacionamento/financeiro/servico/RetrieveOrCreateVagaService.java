package com.estacionamento.financeiro.servico;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.entities.Vaga;
import com.estacionamento.financeiro.repositories.VagaRepository;

@Service
@RequiredArgsConstructor
public class RetrieveOrCreateVagaService {
    private final VagaRepository vagaRepository;
    public Vaga execute(Vaga vaga){
        return vagaRepository.findByIdentificadorPlaca(vaga.getIdentificadorvaga())
                .orElse(vagaRepository.save(vaga));
    }
}
