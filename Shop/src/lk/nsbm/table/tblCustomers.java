package lk.nsbm.table;

public class tblCustomers {

    private String customerid;
    private String fname;
    private String lname;
    private String contact;

    public tblCustomers(){}

    public tblCustomers(String id,String fname,String lname,String contact){
        this.customerid=id;
        this.fname=fname;
        this.lname=lname;
        this.contact=contact;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
