package org.ianmiguel.herencia;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

public class Appherencia {
    public static void main(String[] args) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction t = ss.beginTransaction();

        //Creamos los objetos cantante
        Cantante cantante = new Cantante("Pedro",100.000);
        CantanteIndependiente cantanteIndependiente = new CantanteIndependiente("Pedriqui",20.000,"Pedro el Guapo");

        //Persistimos los dos objetos
        ss.persist(cantante);
        ss.persist(cantanteIndependiente);

        //Aplicamos los cambios en la base
        t.commit();
    }
}
