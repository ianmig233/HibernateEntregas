package org.ianmiguel.bidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="Empleado")
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    @OneToOne(mappedBy = "Empleado",cascade = CascadeType.PERSIST)
    private double salario;

    //@ManyToMany(cascade = {CascadeType.ALL})
    //@JoinColumn(name="FK_Coche",referencedColumnName = "id_coche")

    public Empleado() {
    }

    public Empleado(String nom, double salario) {
        this.nom = nom;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salario=" + salario +
                '}';
    }
}