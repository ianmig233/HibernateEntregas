package org.ianmiguel.relaciones;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="CocheOne")
public class Coche implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_coche;
    @Column(name="nombre")
    private String nombre;
    @Column(name="matricula")
    private String matricula;
    @Column(name="fecha")
    private int fecha;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="FK_Concesionario",referencedColumnName = "id_conce")
    private Concesionario concesionario;
    public Coche(String nombre, String matricula, int fecha, Concesionario concesionario){
        this.nombre=nombre;
        this.matricula=matricula;
        this.fecha=fecha;
        this.concesionario=concesionario;
    }

    public Coche() {

    }

    public int getId_coche() {
        return id_coche;
    }

    public void setId_coche(int id_coche) {
        this.id_coche = id_coche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public Concesionario getConcesionario() {
        return concesionario;
    }

    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }
}
