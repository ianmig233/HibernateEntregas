package org.ianmiguel.manytomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="ConcesionarioMany")
public class ConcesionarioMany implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre_con")
    private String nombre_con;

    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "ConcesionarioMany",cascade = CascadeType.PERSIST)
    private List<Socio> socios;
    public ConcesionarioMany(){
    }
    public ConcesionarioMany(String nombre_con, String direccion, List<Socio> socios){
        this.nombre_con=nombre_con;
        this.direccion=direccion;
        this.socios = socios;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }
}
