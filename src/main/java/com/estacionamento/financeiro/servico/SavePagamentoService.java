package com.estacionamento.financeiro.servico;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.entities.Pagamento;
import com.estacionamento.financeiro.repositories.PagamentoRepository;

@Service
@RequiredArgsConstructor
public class SavePagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public Pagamento executar(Pagamento pagamento){
        return pagamentoRepository.save(pagamento);
    }
}
