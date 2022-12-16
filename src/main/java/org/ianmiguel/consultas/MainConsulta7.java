package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;

import java.util.List;

public class MainConsulta7 {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        Query<Object[]> q7 = ss.createQuery("SELECT COUNT(C.nombreartistico),C.cache FROM Cantante C GROUP BY C.cache");
        List<Object[]> resultado = q7.list();
        for (Object[] contador : resultado)
            System.out.println("Hay "+contador[0]+ " cantante que cobran "+contador[1]+" $ de cache");
    }
}
