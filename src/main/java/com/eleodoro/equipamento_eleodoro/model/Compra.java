package com.eleodoro.equipamento_eleodoro.model;

public class Compra {
    
    private String loja;
    private int preco;
    private String equipamento;
   
   
    public Compra() {
    }


    public Compra(String loja, int preco, String equipamento) {
        this.loja = loja;
        this.preco = preco;
        this.equipamento = equipamento;
    }


    public String getLoja() {
        return loja;
    }


    public void setLoja(String loja) {
        this.loja = loja;
    }


    public int getPreco() {
        return preco;
    }


    public void setPreco(int preco) {
        this.preco = preco;
    }


    public String getEquipamento() {
        return equipamento;
    }


    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((loja == null) ? 0 : loja.hashCode());
        result = prime * result + preco;
        result = prime * result + ((equipamento == null) ? 0 : equipamento.hashCode());
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
        Compra other = (Compra) obj;
        if (loja == null) {
            if (other.loja != null)
                return false;
        } else if (!loja.equals(other.loja))
            return false;
        if (preco != other.preco)
            return false;
        if (equipamento == null) {
            if (other.equipamento != null)
                return false;
        } else if (!equipamento.equals(other.equipamento))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Compra [loja=" + loja + ", preco=" + preco + ", equipamento=" + equipamento + "]";
    }
    
    
    
}
