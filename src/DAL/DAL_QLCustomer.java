
package DAL;

import DTO.Customer;
import DTO.Account;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class DAL_QLCustomer {
    
    private static DAL_QLCustomer _INSTANCE;
    private DAL_QLCustomer() {
        
    }
     public static DAL_QLCustomer getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new DAL_QLCustomer();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Customer> GetListCustomer_DAL(){
        String sql = "Select * from Customer";
        return DB_Helper.getInstance().GetListCustomer(sql);
    }
    public void DeleteCustomer_DAL(String id){
        String sql = "Delete from Customer where idCustomer="+id;
        DB_Helper.getInstance().ExcuteDB(sql);
    }
    public ArrayList<Customer> GetListCustomer_DAL(String name) {
        ArrayList<Customer> ar = new ArrayList<Customer>();
        try {
            switch(name){
            case "": ar = getInstance().GetListCustomer_DAL(); break;
            default: {
                String sql = "Select * from Customer where nameCustomer like '%" + name + "%'";
                ar = DB_Helper.getInstance().GetListCustomer(sql);
                break;
            }
        }
        } catch (Exception e) {
            ar = null;
        }
        return ar;
    }
    public ArrayList<Account> GetListAccount_DAL(){
        String sql = "Select * from Account";
        return DB_Helper.getInstance().GetListAccount(sql);
    }
    
    public Account GeAccount_DAL(String usn){
        String sql = "Select * from Account where Username= ?";
        return DB_Helper.getInstance().GetAccount(sql,usn);
    }
    public void UpdatePassword_DAL(String npw, String pw){
        String sql = "Update Account set Password=? where Password=?";
        DB_Helper.getInstance().ExcuteDB(sql, npw, pw);
    }
    public boolean CheckCustomer_DAL(int id){
        boolean check = false;
        String sql = "Select * from Customer";
        ArrayList<Customer> c = DB_Helper.getInstance().GetListCustomer(sql);
        for (Customer customer : c) {
            if(customer.id == id) check = true;
        }
        return check;
    }
    public void AddCustomer_DAL(Customer c){
        String sql = "Insert into Customer(idCustomer,nameCustomer,ageCustomer,"
                + "addressCustomer,phoneNumber,idTypeCustomer,genderCustomer) values (?,?,?,?,?,?,?)";
        DB_Helper.getInstance().AddCustomer(sql, c);
    }
    public void EditCustomer_DAL(Customer c){
        String sql = "Update Customer set nameCustomer = ? , ageCustomer = ? , addressCustomer = ? , phoneNumber = ? , "
                + "idTypeCustomer = ?, genderCustomer = ? where idCustomer = ? ";
        DB_Helper.getInstance().EditCustomer(sql, c);
    }
    
}
