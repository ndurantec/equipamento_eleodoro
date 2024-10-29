package com.eleodoro.equipamento_eleodoro.model;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Equipamento implements Serializable {

    private static final Long serialVersionUID = 1L;
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String nome;
    private String local;
    private int marca;
    private String status;
    private int numeracao;

    
    @Deprecated
    public Equipamento() {
    }


    public Equipamento(String nome, String local, int marca, String status, int numeracao) {
        this.nome = nome;
        this.local = local;
        this.marca = marca;
        this.status = status;
        this.numeracao = numeracao;
    }


    public static Long getSerialversionuid() {
        return serialVersionUID;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + marca;
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        result = prime * result + numeracao;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Equipamento other = (Equipamento) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (marca != other.marca)
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        if (numeracao != other.numeracao)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Equipamento [id=" + id + ", nome=" + nome + ", local=" + local + ", marca=" + marca + ", status="
                + status + ", numeracao=" + numeracao + "]";
    }

    
}
