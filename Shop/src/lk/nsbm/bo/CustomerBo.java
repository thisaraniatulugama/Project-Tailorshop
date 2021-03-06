package lk.nsbm.bo;

import lk.nsbm.dto.CustomerDTO;
import lk.nsbm.table.tblCustomers;

import java.util.ArrayList;

public interface CustomerBo  {

    public void addCustomer(CustomerDTO customer);
    public String getLastCustomerid();
    public ArrayList<tblCustomers> getAllCustomers();
    public ArrayList<tblCustomers> searchCustomer(String data);
}
