package com.eleodoro.equipamento_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.equipamento_eleodoro.model.Manutencao;

public class ManutencaoDTO {
   
    private String nome;
    private String email;
    private double telefone;
    private LocalDateTime data;
    private Float custo;
    //private Equipamento equipamento;
    private String local;
    
    @Deprecated  
    public ManutencaoDTO() {
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public double getTelefone() {
        return telefone;
    }



    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }



    public LocalDateTime getData() {
        return data;
    }



    public void setData(LocalDateTime data) {
        this.data = data;
    }



    public Float getCusto() {
        return custo;
    }



    public void setCusto(Float custo) {
        this.custo = custo;
    }



    public String getLocal() {
        return local;
    }



    public void setLocal(String local) {
        this.local = local;
    }

    public Manutencao novaManutencao() {
        return new Manutencao(null, nome, email, telefone, data, custo, local);
    }



   
}
