package org.ianmiguel.onetomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="ConcesionarioOne")
public class Concesionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_conce;

    @Column(name = "nombre_con")
    private String nombre_con;

    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "Concesionario",cascade = CascadeType.PERSIST)
    private List<Coche> coches;
    public Concesionario(){
    }
    public Concesionario(String nombre_con, String direccion, List<Coche> coches){
        this.nombre_con=nombre_con;
        this.direccion=direccion;
        this.coches = coches;
    }

    public int getId_conce() {
        return id_conce;
    }

    public void setId_conce(int id_conce) {
        this.id_conce = id_conce;
    }

    public String getNombre_con() {
        return nombre_con;
    }

    public void setNombre_con(String nombre_con) {
        this.nombre_con = nombre_con;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coche) {
        this.coches = coche;
    }
}
