package org.ianmiguel.herencia;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@DiscriminatorValue("Cantante Independiente")
public class CantanteIndependiente extends Cantante {

    @Column(name = "NombreReal")
    private String nombreReal;

    public CantanteIndependiente(){
        super();
    }

    public CantanteIndependiente(String nombreartistico, double cache, String nombreReal){
        super(nombreartistico, cache);
        this.nombreReal=nombreReal;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
}
