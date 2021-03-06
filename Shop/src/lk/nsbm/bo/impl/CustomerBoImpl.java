package lk.nsbm.bo.impl;

import lk.nsbm.bo.CustomerBo;
import lk.nsbm.dto.CustomerDTO;
import lk.nsbm.entity.Customer;
import lk.nsbm.table.tblCustomers;
import lk.nsbm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {

    @Override
    public void addCustomer(CustomerDTO customer) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            Customer cust=new Customer(customer.getCustomerid(),customer.getFname(),customer.getLname(),customer.getAddress(),customer.getContact(),customer.getNic());
            session.saveOrUpdate(cust);
        }catch(Exception e){

        }
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public String getLastCustomerid() {

        String id=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            Query q= session.createSQLQuery("SELECT customerid FROM customer ORDER BY customerid DESC LIMIT 1");
            List list = q.list();

            if(list.isEmpty()){
                id="C001";
            }else{
                String lastid=(String)list.get(0);
                String[] arr = lastid.split("C");
                int i = Integer.parseInt(arr[1]);
                if(i<10){
                    id="C00"+(++i);
                }else if(i<100){
                    id="C0"+(++i);
                }else{
                    id="C"+(++i);
                }
            }

        }catch (Exception e){

        }
        session.getTransaction().commit();
        session.close();
        return id;
    }

    @Override
    public ArrayList<tblCustomers> getAllCustomers() {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ArrayList<tblCustomers>arr=new ArrayList<>();
        try{
            Query q=session.createNativeQuery("SELECT * FROM customer",Customer.class);
            List<Customer>list=q.list();

            for(Customer c:list){
                arr.add(new tblCustomers(c.getCustomerid(),c.getFname(),c.getLname(),c.getContact()));
            }

        }catch(Exception e){

        }
        session.getTransaction().commit();
        session.close();
        return arr;
    }

    @Override
    public ArrayList<tblCustomers> searchCustomer(String data) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        ArrayList<tblCustomers>arr=new ArrayList<>();
        try{
            Query<Customer> q= session.createNativeQuery("SELECT * FROM customer WHERE customerid='" + data + "' OR contact='" + data + "'", Customer.class);
            List<Customer>list=q.list();
            for(Customer c:list){
                arr.add(new tblCustomers(c.getCustomerid(),c.getFname(),c.getLname(),c.getContact()));
            }
        }catch(Exception e){

        }
        session.getTransaction().commit();
        session.close();
        return arr;
    }
}
