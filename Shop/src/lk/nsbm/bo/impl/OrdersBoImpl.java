package lk.nsbm.bo.impl;

import lk.nsbm.bo.OrdersBo;
import lk.nsbm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class OrdersBoImpl implements OrdersBo {

    @Override
    public String getLastOrderID() {
        String id=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            Query q= session.createSQLQuery("SELECT orderid FROM orders ORDER BY orderid DESC LIMIT 1");
            List list = q.list();

            if(list.isEmpty()){
                id="P001";
            }else{
                String lastid=(String)list.get(0);
                String[] arr = lastid.split("P");
                int i = Integer.parseInt(arr[1]);
                if(i<10){
                    id="P00"+(++i);
                }else if(i<100){
                    id="P0"+(++i);
                }else{
                    id="P"+(++i);
                }
            }

        }catch (Exception e){

        }
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
