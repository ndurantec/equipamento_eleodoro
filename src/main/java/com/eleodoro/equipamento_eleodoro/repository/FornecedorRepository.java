package com.eleodoro.equipamento_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.equipamento_eleodoro.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository <Fornecedor, Long> {
    
}
