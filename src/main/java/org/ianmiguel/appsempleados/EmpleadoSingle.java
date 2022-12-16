package org.ianmiguel.appsempleados;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EmpladoSingle")
public class EmpleadoSingle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name="nombre")
    private String nom;
    @Column
    private double salario;

    public EmpleadoSingle() {
    }

    public EmpleadoSingle(String nom, double salario) {
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
