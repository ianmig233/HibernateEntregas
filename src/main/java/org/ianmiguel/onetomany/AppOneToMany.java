package org.ianmiguel.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class AppOneToMany {

    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction t = ss.beginTransaction();
        // el propietario de la relación es la parte de Many: coche
        Coche c1 = new Coche("T20","234ABD23",5,null);
        Coche c2 = new Coche("Pablo","234ABD1233",4,null);
        List<Coche> coches = new ArrayList<Coche>();
        coches.add(c1); coches.add(c2);
        Concesionario conce = new Concesionario("Marcos","Calle de al lado",coches);
        c2.setConcesionario(conce);
        c1.setConcesionario(conce);

        ss.persist(conce);
        t.commit();

    }

}
