package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;
import org.ianmiguel.Empleado;
import java.util.Iterator;

public class MainCosulta1 {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        Query<Empleado> q = ss.createQuery("from Empleado", Empleado.class);

        Iterator<Empleado> empleado = q.stream().iterator();
        while (empleado.hasNext())
            System.out.println(empleado.next());
        t.commit();
    }
}
