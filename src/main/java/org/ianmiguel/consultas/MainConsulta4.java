package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;
import org.ianmiguel.herencia.Cantante;

public class MainConsulta4 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();

        Query<Cantante> q4 = ss.createQuery("FROM Cantante C WHERE UPPER(C.nombreartistico) = 'Pedro'");
        Cantante c1 = q4.uniqueResult();
        System.out.println("El cantatne "+c1.getNombreartistico()+" cobra "+ c1.getCache()+ " $.");
    }

}
