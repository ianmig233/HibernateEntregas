package org.ianmiguel.herencia;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Cantante")
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Cantante")
public class Cantante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NombreArtistico")
    private String nombreartistico;

    @Column
    private double cache;

    //Constructor
    public Cantante(){
    }

    public Cantante(String nombreartistico, double cache){
        this.nombreartistico=nombreartistico;
        this.cache=cache;
    }

    //Setters y getters

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getNombreartistico() {
        return nombreartistico;
    }

    public void setNombreartistico(String nombreartistico) {
        this.nombreartistico = nombreartistico;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    @Override
    public String   toString() {
        return "Cantante{" +
                "id=" + id +
                ", nombreartistico='" + nombreartistico + '\'' +
                ", cache=" + cache +
                '}';
    }
}
