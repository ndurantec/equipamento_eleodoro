package com.eleodoro.equipamento_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.equipamento_eleodoro.model.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Long>{
    
}
