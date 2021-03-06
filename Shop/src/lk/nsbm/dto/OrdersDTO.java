package lk.nsbm.dto;

import java.util.Date;

public class OrdersDTO {

    private String orderid;
    private Date date;
    private double total;
    private double paid;

    public OrdersDTO(){}

    public OrdersDTO(String id,Date date,double total,double paid){
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
