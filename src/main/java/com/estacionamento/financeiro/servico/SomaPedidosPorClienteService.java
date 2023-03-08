package com.estacionamento.financeiro.servico;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.entities.Pagamento;
import com.estacionamento.financeiro.payloads.response.RelatorioCliente;
import com.estacionamento.financeiro.repositories.PagamentoRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SomaPedidosPorClienteService {
    private final PagamentoRepository pagamentoRepository;
    @Cacheable(cacheNames = "rlcliente", key ="#identificadorCliente" )
    public RelatorioCliente execute(String identificadorCliente){

        log.info("Relatorio do cliente invocado");
        List<Pagamento> pagamentos = pagamentoRepository.findByClienteIdentificadorPlaca(identificadorCliente);
        RelatorioCliente relatorioCliente = new RelatorioCliente();
        relatorioCliente.setIdentificador(identificadorCliente);
        relatorioCliente.setValor(pagamentos.stream().flatMap(pagamento -> pagamento.getItems().stream())
                .map(item -> item.getQuantidade()*item.getPreco()).reduce(0.0, Double::sum));
        return relatorioCliente;
    }
}
