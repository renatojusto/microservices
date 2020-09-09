package com.db1.microservices.ligacao.repository;

import com.db1.microservices.ligacao.model.Ligacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigacaoRepository extends CrudRepository<Ligacao, Long> {
}
