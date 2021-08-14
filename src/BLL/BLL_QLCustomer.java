/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_QLCustomer;
import DTO.Customer;
import DTO.Account;
import DTO.ViewCustomer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author PHONG VU
 */
public class BLL_QLCustomer {
    
    private static BLL_QLCustomer _INSTANCE;
    private BLL_QLCustomer() {
        
    }
     public static BLL_QLCustomer getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new BLL_QLCustomer();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Customer> GetListCustomer_BLL(){
        return DAL_QLCustomer.getInstance().GetListCustomer_DAL();
    }
    public void DeleteCustomer_BLL(String id){
        DAL_QLCustomer.getInstance().DeleteCustomer_DAL(id);
    }
    public ArrayList<Customer> GetListCustomer_BLL(String name){
        return DAL_QLCustomer.getInstance().GetListCustomer_DAL(name);
    }
    public ArrayList<Account> GetListAccount_BLL(){
        return DAL_QLCustomer.getInstance().GetListAccount_DAL();
    }
    public Account GetAccount_BLL(String usn){
        return DAL_QLCustomer.getInstance().GeAccount_DAL(usn);
    }
    public void UpdatePassword_BLL(String npw, String pw){
        DAL_QLCustomer.getInstance().UpdatePassword_DAL(npw, pw);
    }
    public void ExcuteCustomer_BLL(Customer c){
        boolean check = false;
        if(DAL_QLCustomer.getInstance().CheckCustomer_DAL(c.id)){
            check = true;
        }
        if(!check){
            DAL_QLCustomer.getInstance().AddCustomer_DAL(c);
        }
        else DAL_QLCustomer.getInstance().EditCustomer_DAL(c);
    }
    public Customer GetCustomerByID(int id){
        Customer c = new Customer();
        for (Customer customer : GetListCustomer_BLL()) {
            if(customer.id == id){
                c = customer;
            }
        }
        return c;
    }
    public boolean CheckAccount_BLL(String usn, String pw){
        boolean check = false;
        Account a = GetAccount_BLL(usn);
        if (a.username.equals(usn) && a.password.equals(pw)) {
            check = true;
        }
        return check;
    }
    public int GetTypeAccount_BLL(String usn){
        return GetAccount_BLL(usn).type;
    }
    public ViewCustomer GetViewCustomerByCustomer(Customer c){
        String type;
        String gender;
        if(c.type) type = "Normal";
        else type = "Vip";
        if(c.gender) gender = "Male";
        else gender = "Female";
        return new ViewCustomer(c.id,c.name, c.age, c.adress, c.phone, type, gender);
    }
    
    public ArrayList<ViewCustomer> GetListViewCustomer(){
        ArrayList<ViewCustomer> al = new ArrayList<ViewCustomer>();
        for (Customer c : GetListCustomer_BLL()) {
            al.add(GetViewCustomerByCustomer(c));
        }
        return al;
    }
    public ArrayList<ViewCustomer> GetListViewCustomer(String name){
        ArrayList<ViewCustomer> al = new ArrayList<ViewCustomer>();
        for (Customer c : GetListCustomer_BLL(name)) {
            al.add(GetViewCustomerByCustomer(c));
        }
        return al;
    }
    
}
