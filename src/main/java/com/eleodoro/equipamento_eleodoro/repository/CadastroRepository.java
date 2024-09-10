package com.eleodoro.equipamento_eleodoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eleodoro.equipamento_eleodoro.model.Cadastro;

public interface CadastroRepository extends JpaRepository <Cadastro, Long>{
    
}