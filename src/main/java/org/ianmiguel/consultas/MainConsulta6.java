package org.ianmiguel.consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.ianmiguel.HibernateUtil;

public class MainConsulta6 {

    //Eliminar una entidad de nuestra base de datos
    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();

        String hql = "DELETE FROM Cantante WHERE nombreartistico = 'Messi'";
        Query q6 = ss.createQuery(hql);
        int resultado = q6.executeUpdate();
        System.out.println("Filas afectadas: "+resultado);
        t.commit();
    }
}
