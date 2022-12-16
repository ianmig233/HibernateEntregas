package org.ianmiguel.unidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ClienteUni")
public class ClienteUni implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column
    private String nombre;

    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "cliente")
    private Cuenta cuenta;

    public ClienteUni(){
    }

    public ClienteUni(String nombre, Cuenta cuenta){
        this.nombre=nombre;
        this.cuenta=cuenta;
    }

    public long getId() {
        return id;
    }

    /*public void setId(long id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "ClienteUni{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
