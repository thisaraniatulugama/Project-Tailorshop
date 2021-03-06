package lk.nsbm.util;

import lk.nsbm.entity.Customer;
import lk.nsbm.entity.Orders;
import lk.nsbm.entity.Suits;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory=buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry serReg=new StandardServiceRegistryBuilder().loadProperties("Application.properties").build();
        Metadata mData=new MetadataSources(serReg).addAnnotatedClass(Customer.class).
                addAnnotatedClass(Orders.class).
                addAnnotatedClass(Suits.class).getMetadataBuilder().build();
        return mData.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
