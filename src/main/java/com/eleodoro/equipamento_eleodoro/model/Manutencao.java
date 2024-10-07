package com.eleodoro.equipamento_eleodoro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Manutencao implements Serializable {

    private static final Long serialVersionUID = 1L;
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String nome;
    private String email;
    private double telefone;
    private LocalDateTime data;
    private Float custo;
    //private Equipamento equipamento;
    private String local;

    
    @Deprecated
    public Manutencao() {
    }



    public Manutencao(Long id, String nome, String email, double telefone, LocalDateTime data, Float custo,
            String local) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.data = data;
        this.custo = custo;
        this.local = local;
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



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        long temp;
        temp = Double.doubleToLongBits(telefone);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((custo == null) ? 0 : custo.hashCode());
        result = prime * result + ((local == null) ? 0 : local.hashCode());
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
        Manutencao other = (Manutencao) obj;
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
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (Double.doubleToLongBits(telefone) != Double.doubleToLongBits(other.telefone))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (custo == null) {
            if (other.custo != null)
                return false;
        } else if (!custo.equals(other.custo))
            return false;
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Manutencao [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", data="
                + data + ", custo=" + custo + ", local=" + local + "]";
    }

   

    
}

