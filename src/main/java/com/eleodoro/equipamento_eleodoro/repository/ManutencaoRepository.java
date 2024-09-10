package com.eleodoro.equipamento_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.equipamento_eleodoro.model.Manutencao;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long>{
    
}
