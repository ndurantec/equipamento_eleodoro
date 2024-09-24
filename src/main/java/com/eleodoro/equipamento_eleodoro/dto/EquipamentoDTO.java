package com.eleodoro.equipamento_eleodoro.dto;

import org.springframework.cglib.core.Local;

import com.eleodoro.equipamento_eleodoro.model.Equipamento;

public class EquipamentoDTO {

    private String nome;
  //  private Local local;
    private String marca;
    private boolean status;
    private int numeracao;
   
   
    public EquipamentoDTO() {
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public boolean isStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public int getNumeracao() {
        return numeracao;
    }


    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }
  
    public Equipamento novoEquipamento() {
        return  null;
    }

}
