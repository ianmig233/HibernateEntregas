package org.ianmiguel.appsempleados;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.ianmiguel.Empleados;

import java.util.List;


public class MainEmpleados
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
    public static void main( String[] args )
    {
        insertInicial();

        imprimirTodo();
        //De esta forma podemos cambiar el nombre del empledo 1 y 2
        EntityManager man = emf.createEntityManager();
        man.getTransaction().begin();
        Empleados e = man.find(Empleados.class,1);
        //Permite refrescar para que nos actualice bien los datos
        e = man.merge(e);
        e.setNom("Manolo");
        e.setSalario(2000);
        //Nos permite eliminar del sistema a la entidad
        man.remove(e);
        man.getTransaction().commit();

        imprimirTodo();
        man.close();
    }

    private static void insertInicial(){
        EntityManager man = emf.createEntityManager();
        Empleados e1 = new Empleados("Paco",30);
        Empleados e2 = new Empleados("Marcos",2345);
        man.getTransaction().begin();
        man.persist(e1);
        man.persist(e2);
        man.getTransaction().commit();
        man.close();

    }
    private static void imprimirTodo(){
        EntityManager man = emf.createEntityManager();
        //Hago cast a la lista empleado
        List<Empleados> empleados = (List<Empleados>) man.createQuery("FROM Empleados").getResultList();
        System.out.println("En esta base de datos hay " + empleados.size()+ "empleados.");
        for (Empleados emp :empleados){
            System.out.println(emp.toString());
        }

    }
}
