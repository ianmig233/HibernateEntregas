package org.ianmiguel;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cli;

    @Column(name = "nombre_cli")
    private String nombre_cli;

    @Column(name = "apellido1")
    private String apellido1;

    @Column(name = "apellido2")
    private String apellido2;

    //@OneToOne(cascade = CascadeType.PERSIST)
    //@JoinColumn(name="FK_Empleado",referencedColumnName = "id")

    public Cliente(){
    }

    public Cliente(String nombre_cli, String apellido1, String apellido2){
        this.nombre_cli=nombre_cli;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
