package com.eleodoro.equipamento_eleodoro.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Manutencao implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private static final Long serialVersionUID = 1L;
    public Long id;


    private String local;
    private Float telefone;
    private String email;
    private LocalDateTime data;
    private Float custo;
    //private Equipamento equipamento;

    
    public Manutencao() {
    }

    public Manutencao(String local, Float telefone, String email, LocalDateTime data, Float custo) {
        this.local = local;
        this.telefone = telefone;
        this.email = email;
        this.data = data;
        this.custo = custo;
<<<<<<< HEAD
    }

=======
    } 
>>>>>>> d362e0d630ec8a2c95f853947253a40ddafd7861

    public String getLocal() {
        return local;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void enviarParaManuntencao() {

    }

    public void receberDaManutencao() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((local == null) ? 0 : local.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((custo == null) ? 0 : custo.hashCode());
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
        if (local == null) {
            if (other.local != null)
                return false;
        } else if (!local.equals(other.local))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
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
        return true;
    }

    @Override
    public String toString() {
        return "manutencao [local=" + local + ", telefone=" + telefone + ", email=" + email + ", data=" + data
                + ", custo=" + custo + "]";
    }



    
}

