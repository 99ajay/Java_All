package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st = new Student();
        st.setId(103);
        st.setName("Ajay verma");
        st.setCity("Varanasi");
        
        //factory will give us session
//        Session session = factory.getCurrentSession();
        Session session = factory.openSession();

        
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        
        
//        System.out.println(st);
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
    }
}
