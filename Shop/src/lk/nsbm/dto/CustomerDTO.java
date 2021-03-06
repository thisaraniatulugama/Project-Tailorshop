package lk.nsbm.dto;

public class CustomerDTO {

    private  String customerid;

    private  String fname;
    private  String lname;
    private String address;
    private String contact;
    private  String nic;

    public CustomerDTO(){}

    public CustomerDTO(String id,String fname,String lname,String address,String contact,String nic){
        this.setCustomerid(id);

        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.contact=contact;
        this.nic=nic;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
}
