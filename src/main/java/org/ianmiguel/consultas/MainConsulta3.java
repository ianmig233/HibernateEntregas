package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.ianmiguel.onetomany.Coche;
import org.ianmiguel.HibernateUtil;

public class MainConsulta3 {
    public static void main(String[] args) {
        int fechaCoche=26;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();

        Query<Coche> q = ss.createQuery("from Coche C where fecha = :fechaCoche");
        q.setParameter("fecha",fechaCoche);
        Coche co = (Coche) q.uniqueResult();
        System.out.println("El coche de " + fechaCoche + " años es " + co);

        //t.commit();
    }
}
