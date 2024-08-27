package com.eleodoro.equipamento_eleodoro.dto;

public class CadastroDTO {
    private String Nome;
    private String Marca;
    private String Setor;
    private int ID;
   

    public CadastroDTO() {
    }


    public CadastroDTO(String nome, String marca, String setor, int iD) {
        Nome = nome;
        Marca = marca;
        Setor = setor;
        ID = iD;
    }


    public String getNome() {
        return Nome;
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

    
    
}
