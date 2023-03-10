package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;
import java.util.List;

public class MainConsulta2 {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();

        Query<Object []> q = ss.createQuery("Select fecha,count(C.nombre) from Coche C group by C.fecha");

        List<Object []> coche = q.list();
        for(Object[] c: coche)
            System.out.println("Los de " + c[0] + " años son " + c[1]);


    }
}
