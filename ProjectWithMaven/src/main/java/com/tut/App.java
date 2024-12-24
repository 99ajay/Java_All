package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student st = new Student();
        st.setId(103);
        st.setName("Ajay verma");
        st.setCity("Varanasi");
        
        //creating oblect of the class Address_class
        
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Lucknow");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.444);
        //reading the images from the folder 
        FileInputStream fis = new FileInputStream("src/main/java/image4.jpeg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        //reading the image 
        
        
        //factory will give us session
//        Session session = factory.getCurrentSession();
        Session session = factory.openSession();

        
        session.beginTransaction();
        session.save(st);
        session.save(ad);
        session.getTransaction().commit();
        session.close();
        
        System.out.println("Doe BHai log");
        
        
//        System.out.println(st);
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
        
        
        
        
        
    }
}
