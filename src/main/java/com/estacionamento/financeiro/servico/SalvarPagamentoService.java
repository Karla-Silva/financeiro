package com.estacionamento.financeiro.servico;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import com.estacionamento.financeiro.entities.Cliente;
import com.estacionamento.financeiro.entities.Item;
import com.estacionamento.financeiro.entities.Pagamento;
import com.estacionamento.financeiro.entities.Vaga;
import com.estacionamento.financeiro.payloads.request.ItemRequest;
import com.estacionamento.financeiro.payloads.request.PagamentoClienteRequest;
import com.estacionamento.financeiro.repositories.PagamentoRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SalvarPagamentoService {

    private final RetrieveOrCreateVagaService retrieveOrCreateVagaService;

    private final RetrieveOrSaveClienteService retrieveOrSaveClienteService;
    private final PagamentoRepository pagamentoRepository;

    @CacheEvict(cacheNames = "rlcliente", allEntries = true)
    public void execute(PagamentoClienteRequest pagamentoClienteRequest){
        Cliente cliente = new Cliente();
        BeanUtils.copyProperties(pagamentoClienteRequest.getCliente(),cliente);
        List<Item> items = pagamentoClienteRequest.getItems().stream().map(this::getItems)
                .collect(Collectors.toList());

        Cliente clienteSaved = retrieveOrSaveClienteService.execute(cliente);

        Pagamento pagamento = new Pagamento();
        pagamento.setCliente(clienteSaved);
        pagamento.adicionarItems(items);
        pagamentoRepository.save(pagamento);
    }

    private Item getItems(ItemRequest itemRequest) {
        Item item = new Item();
        BeanUtils.copyProperties(itemRequest, item);
        Vaga vaga = new Vaga();
        BeanUtils.copyProperties(itemRequest.getVaga(), vaga);
        item.setVaga(retrieveOrCreateVagaService.execute(vaga));
        return item;
    }
}
