package com.eleodoro.equipamento_eleodoro.dto;

import java.time.LocalDateTime;

import com.eleodoro.equipamento_eleodoro.model.Manutencao;

public class ManutencaoDTO {

    private String local;
    private Float telefone;
    private String email;
    private LocalDateTime data;
    private Float custo;
    
    public ManutencaoDTO() {
    }

    public ManutencaoDTO(String local, Float telefone, String email, LocalDateTime data, Float custo) {
        this.local = local;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
        this.custo = custo;
    }

    public String getLocal() {
        return local;
    }


    public void setLocal(String local) {
        this.local = local;
    }


    public Float getTelefone() {
        return telefone;
    }


    public void setTelefone(Float telefone) {
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
        this.data = data;
    }


    public Float getCusto() {
        return custo;
    }


    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public Manutencao novaManutencao() {
        return new Manutencao(local, telefone, email, data, custo);
    }

}
