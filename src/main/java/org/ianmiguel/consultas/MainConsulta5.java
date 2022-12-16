package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;
import org.ianmiguel.herencia.Cantante;

public class MainConsulta5 {

    //Actualización cantante Pedro y le cambiamos el el nombre

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        String hql = "UPDATE Cantante SET nombreartistico = :Nombre WHERE nombreartistico = 'Pedro'";
        Query q5 = ss.createQuery(hql);
        q5.setParameter("Pedro","Messi");
        int resultado = q5.executeUpdate();
        System.out.println("Filas afectadas por el, cambio del nombre: "+resultado);
        t.commit();

    }

}
