package com.db1.microservices.ligacao.controller;

import com.db1.microservices.ligacao.model.Ligacao;
import com.db1.microservices.ligacao.service.LigacaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligacao")
public class LigacaoResource {

    private final transient Logger log = LoggerFactory.getLogger(LigacaoResource.class);
    private final LigacaoService ligacaoService;

    public LigacaoResource(LigacaoService ligacaoService) {
        this.ligacaoService = ligacaoService;
    }

    @PostMapping
    public ResponseEntity<Ligacao> salvarLigacao(@RequestBody Ligacao ligacao) {
        log.debug("Salvando a ligação...");
        Ligacao novaLigacao = this.ligacaoService.salvarLigacao(ligacao);
        return new ResponseEntity<>(novaLigacao, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Ligacao>> obterLigacoes() {
        log.debug("Obtendo as ligações...");
        Iterable<Ligacao> ligacoes = this.ligacaoService.getTodasLigacoes();
        return new ResponseEntity(ligacoes, HttpStatus.OK);
    }
}
