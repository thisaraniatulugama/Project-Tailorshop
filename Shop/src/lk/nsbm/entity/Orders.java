package lk.nsbm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Orders {

    @Id
    private String orderid;
    private String date;
    private double total;
    private double paid;

    public Orders(){}

    public Orders(String id,String date,double total,double paid){
        this.orderid=id;
        this.date=date;
        this.total=total;
        this.paid=paid;
    }


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }
}
