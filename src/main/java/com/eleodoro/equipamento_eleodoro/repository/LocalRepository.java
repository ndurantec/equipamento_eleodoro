package com.eleodoro.equipamento_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.equipamento_eleodoro.model.Local;

public interface LocalRepository extends JpaRepository<Local, Long>{
    
}