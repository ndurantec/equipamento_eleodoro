package com.eleodoro.equipamento_eleodoro.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Local implements Serializable{
    
    private static final Long serialversionUID_ = 1L;
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private Local local;

    public Local() {
    }

    public Local(Long id, Local local) {
        this.id = id;
        this.local = local;
    }

    public static Long getSerialversionuid() {
        return serialversionUID_;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Local other = (Local) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
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
        return "Local [id=" + id + ", local=" + local + "]";
    }

    
   
}
