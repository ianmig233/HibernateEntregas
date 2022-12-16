package org.ianmiguel.unidirec;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

public class AppUnidirec {
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        ClienteUni cli = new ClienteUni("Pedri",null);
        Cuenta c1 = new Cuenta("CuentaPersonal1",cli);

        ss.persist(c1);
        t.commit();
    }
}
