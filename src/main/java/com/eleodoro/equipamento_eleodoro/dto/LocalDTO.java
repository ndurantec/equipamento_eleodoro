package com.eleodoro.equipamento_eleodoro.dto;

import com.eleodoro.equipamento_eleodoro.model.Local;

public class LocalDTO {
   
    private Local local;

    public LocalDTO() {
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Local novoLocal() {
      return new Local(null, local);
    }








    
}
