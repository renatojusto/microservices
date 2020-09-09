package com.db1.microservices.ligacao.service;

import com.db1.microservices.ligacao.model.Ligacao;
import com.db1.microservices.ligacao.repository.LigacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class LigacaoService {

    private LigacaoRepository ligacaoRepository;

    private LigacaoService(LigacaoRepository ligacaoRepository) {
        this.ligacaoRepository = ligacaoRepository;
    }

    public Ligacao salvarLigacao(Ligacao ligacao) {
        return this.ligacaoRepository.save(ligacao);
    }

    public Iterable<Ligacao> getTodasLigacoes() {
        return this.ligacaoRepository.findAll();
    }

}
