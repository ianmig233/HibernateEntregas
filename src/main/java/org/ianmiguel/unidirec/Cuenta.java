package org.ianmiguel.unidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Cuenta")
public class Cuenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column
    private String nombre;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_cliente", referencedColumnName = "id")
    private ClienteUni cliente;

    public Cuenta(){
    }

    public Cuenta(String nombre, ClienteUni cliente){
        this.nombre=nombre;
        this.cliente=cliente;
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

    public ClienteUni getCliente() {
        return cliente;
    }

    public void setCliente(ClienteUni cliente) {
        this.cliente = cliente;
    }



    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
