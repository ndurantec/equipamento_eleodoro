package com.eleodoro.equipamento_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.equipamento_eleodoro.model.Manutencao;

public class ManutencaoDTO {
   
    private String local;
    private double telefone;
    private String email;
    private LocalDateTime data;
    private Float custo;
    //private Equipamento equipamento;
    private String responavel;
    
    
    public ManutencaoDTO() {
    }


    public String getLocal() {
        return local;
    }



    public void setLocal(String local) {
        this.local = local;
    }



    public double getTelefone() {
        return telefone;
    }



    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public LocalDateTime getData() {
        return data;
    }



    public void setData(LocalDateTime data) {
        System.out.println("A data --> " + data);
        this.data = data;
    }



    public Float getCusto() {
        return custo;
    }



    public void setCusto(Float custo) {
        this.custo = custo;
    }



    public String getResponavel() {
        return responavel;
    }



    public void setResponavel(String responavel) {
        this.responavel = responavel;
    }


    public Manutencao novaManutencao() {
        return new Manutencao(null, local, telefone, email, data, custo, responavel);
    }
}
