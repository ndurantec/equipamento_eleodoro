package com.eleodoro.equipamento_eleodoro.dto;

public class FornecedorDTO {
    private String nome;
    private String telefone;
    private String endereco;
   
   
    public FornecedorDTO() {
    }


    public FornecedorDTO(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
  

}