package org.ianmiguel.appsempleados;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

public class AppEliminaEmpleado {
    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        // obtengo el empleado a eliminar
        EmpleadoSingle emp = session.get(EmpleadoSingle.class,52);

        System.out.println(emp);

        session.remove(emp);
        // NO NECESITO HACER PERSIST PORQUE LA OBTENCIÓN YA LO DEJA EN EL AREA DE PERSISTENCIA
        tr.commit();
        session.close();
    }
}
