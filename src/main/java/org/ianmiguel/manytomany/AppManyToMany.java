package org.ianmiguel.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.ianmiguel.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class AppManyToMany {
    public static void main(String[] args) {
       SessionFactory sf = HibernateUtil.getSessionFactory();
       Session ss = sf.openSession();
       Transaction t = ss.beginTransaction();

        ConcesionarioMany c1=new ConcesionarioMany("Desarrollo de P","CALLE PALO",null);
        List<ConcesionarioMany> conce = new ArrayList<ConcesionarioMany>(); conce.add(c1);
        Socio s1 = new Socio("Emilio Culona","Calle Ronaldo",true,conce);
        List<Socio> socio=new ArrayList<>();
        socio.add(s1);
        c1.setSocios(socio);
        ss.persist(c1);
        t.commit();

    }
}
