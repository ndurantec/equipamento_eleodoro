package com.eleodoro.equipamento_eleodoro.model;

public class Transporte {

    public String Motorista;
    public String origem;
    public String destino;

    public Transporte() {
    }

    public Transporte(String motorista, String origem, String destino) {
        Motorista = motorista;
        this.origem = origem;
        this.destino = destino;
    }

    public String getMotorista() {
        return Motorista;
    }

    public void setMotorista(String motorista) {
        Motorista = motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }

       
}
