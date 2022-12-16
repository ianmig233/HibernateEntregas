package org.ianmiguel.bidirec;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="EmpleadoHerencia")
public class EmpleadoHerencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name="nombre")
    private String nom;

    @OneToOne(mappedBy = "EmpleadoHerencia",cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FK_usuario",referencedColumnName = "id")
    private Usuario usuario;

    //@ManyToMany(cascade = {CascadeType.ALL})
    //@JoinColumn(name="FK_Coche",referencedColumnName = "id_coche")

    public EmpleadoHerencia() {
    }

    public EmpleadoHerencia(String nom, Usuario usuario) {
        this.nom = nom;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}