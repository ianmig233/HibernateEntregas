package org.ianmiguel.appsempleados;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

public class AppModificaSalarios {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        // obtengo el primer empleado
        EmpleadoSingle e1 = session.get(EmpleadoSingle.class,1);
        // obtengo el segundo empleado
        EmpleadoSingle e2 = session.get(EmpleadoSingle.class,2);
        System.out.println(e1);

        // resto 1000 al primero y al segundo empleado
        e1.setSalario(e1.getSalario()-1000);
        e2.setSalario(e2.getSalario()-1000);
        session.detach(e1);
        t.commit();
        session.close();
    }
}
