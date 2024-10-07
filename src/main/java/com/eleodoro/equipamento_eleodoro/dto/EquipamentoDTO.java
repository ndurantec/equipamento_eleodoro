package com.eleodoro.equipamento_eleodoro.dto;

import com.eleodoro.equipamento_eleodoro.model.Equipamento;

public class EquipamentoDTO {
   
    private String nome;
    private String local;
    private int marca;
    private String status;
    private int numeracao;
    
    @Deprecated
    public EquipamentoDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    
    public Equipamento novoEquipamento(){
        return new Equipamento(nome, local, marca, status, numeracao);
    }
   
    
}
