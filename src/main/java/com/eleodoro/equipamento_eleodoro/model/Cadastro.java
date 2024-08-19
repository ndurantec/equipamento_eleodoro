package com.eleodoro.equipamento_eleodoro.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cadastro implements Serializable {
    
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

    private static final Long serialVersionUID=1L;

    private Long id;
    private String Nome;
    private String Marca;
    private String Setor;
    private int ID;
   
   
    public Cadastro() {
    }


    public Cadastro(String nome, String marca, String setor, int iD) {
        Nome = nome;
        Marca = marca;
        Setor = setor;
        ID = iD;
    }




    public String getNome() {
        return Nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


    public String getMarca() {
        return Marca;
    }


    public void setMarca(String marca) {
        Marca = marca;
    }


    public String getSetor() {
        return Setor;
    }


    public void setSetor(String setor) {
        Setor = setor;
    }


    public int getID() {
        return ID;
    }


    public void setID(int iD) {
        ID = iD;
    }

    public void CadastrarEquipamentos() {

    }


    @Override
    public String toString() {
        return "Cadastro [Nome=" + Nome + ", Marca=" + Marca + ", Setor=" + Setor + ", ID=" + ID + "]";
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
        result = prime * result + ((Marca == null) ? 0 : Marca.hashCode());
        result = prime * result + ((Setor == null) ? 0 : Setor.hashCode());
        result = prime * result + ID;
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
        Cadastro other = (Cadastro) obj;
        if (Nome == null) {
            if (other.Nome != null)
                return false;
        } else if (!Nome.equals(other.Nome))
            return false;
        if (Marca == null) {
            if (other.Marca != null)
                return false;
        } else if (!Marca.equals(other.Marca))
            return false;
        if (Setor == null) {
            if (other.Setor != null)
                return false;
        } else if (!Setor.equals(other.Setor))
            return false;
        if (ID != other.ID)
            return false;
        return true;
    }


  
    
}
