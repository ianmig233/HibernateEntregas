package org.ianmiguel.manytomany;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Socio")
public class Socio implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "nombre")
        private String nombre;

        @Column(name = "direccion")
        private String direccion;

        @Column(name = "Activo")
        private boolean activo;

        @ManyToMany(cascade = CascadeType.PERSIST)
        @JoinTable(name="concesionarimany_socio",
                joinColumns = {@JoinColumn(name="FK_socio",referencedColumnName = "id")},
                inverseJoinColumns = {@JoinColumn(name="FK_concesionario",referencedColumnName = "id")})
        private List<ConcesionarioMany> conce;
        public Socio(){
        }
        public Socio(String nombre, String direccion, boolean activo, List<ConcesionarioMany> conce) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.activo=activo;
            this.conce=conce;
        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getDireccion() {
                return direccion;
        }

        public void setDireccion(String direccion) {
                this.direccion = direccion;
        }

        public boolean isActivo() {
                return activo;
        }

        public void setActivo(boolean activo) {
                this.activo = activo;
        }

        public List<ConcesionarioMany> getConce() {
                return conce;
        }

        public void setConce(List<ConcesionarioMany> conce) {
                this.conce = conce;
        }
}
