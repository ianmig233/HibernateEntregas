package org.ianmiguel.bidirec;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

public class AppBidirec {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        // En este caso al guardar el usuario TAMBIÉN se guarda el empleado
        Empleado e1 = new Empleado("Pedro",2000, null);
        Usuario u1 = new Usuario ("PedroMiguel","123456",e1);
        ss.persist(u1);
        t.commit();
    }
}
