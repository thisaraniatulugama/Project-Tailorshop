package lk.nsbm.bo.impl;

import lk.nsbm.bo.SuitsBo;
import lk.nsbm.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SuitsBoImpl implements SuitsBo {
    @Override
    public String getLastSuitID() {
        String id=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try{
            Query q= session.createSQLQuery("SELECT suitid FROM suits ORDER BY suitid DESC LIMIT 1");
            List list = q.list();

            if(list.isEmpty()){
                id="S001";
            }else{
                String lastid=(String)list.get(0);
                String[] arr = lastid.split("S");
                int i = Integer.parseInt(arr[1]);
                if(i<10){
                    id="S00"+(++i);
                }else if(i<100){
                    id="S0"+(++i);
                }else{
                    id="S"+(++i);
                }
            }

        }catch (Exception e){

        }
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
