package com.eleodoro.equipamento_eleodoro.dto;

import com.eleodoro.equipamento_eleodoro.model.Local;

public class LocalDTO {
   
    private String nome;

    @Deprecated
    public LocalDTO() {
    }

    public LocalDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "LocalDTO [nome=" + nome + "]";
    }

    public Local novoLocal() {
        return new Local(nome);
    }
    
}
