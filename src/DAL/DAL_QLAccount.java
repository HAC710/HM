/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Account;
import DTO.LoginHistory;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author dophu
 */
public class DAL_QLAccount {
    
    private static DAL_QLAccount _INSTANCE;
    private DAL_QLAccount() {
        
    }
     public static DAL_QLAccount getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new DAL_QLAccount();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Account> GetListAccount_DAL(){
        String sql = "Select * from Account";
        return DB_Helper.getInstance().GetListAccount(sql);
    }
    
    public ArrayList<LoginHistory> GetListLoginHistory_DAL(){
        String sql = "Select * from HistoryLogin";
        return DB_Helper.getInstance().GetListLoginHistory(sql);
    }
    
    public void DeleteAccount_DAL(String id){
        String sql = "Delete from Account where idAccount="+id;
        DB_Helper.getInstance().ExcuteNew(sql);
    }
    
    public void DeleteAdminAccount_DAL(String id){
        String sql = "Delete from Account where idAccount="+id;
        DB_Helper.getInstance().ExcuteDB(sql);
    }
    
    public ArrayList<Account> GetListAccount_DAL(String name) {
        ArrayList<Account> ar = new ArrayList<Account>();
        try {
            switch(name){
            case "": ar = getInstance().GetListAccount_DAL(); break;
            default: {
                String sql = "Select * from Account where displayName like '%" + name + "%'";
                ar = DB_Helper.getInstance().GetListAccount(sql);
                break;
            }
        }
        } catch (Exception e) {
            ar = null;
        }
        return ar;
    }
    
    public boolean CheckAccount_DAL(int id){
        boolean check = false;
        String sql = "Select * from Account";
        ArrayList<Account> b = DB_Helper.getInstance().GetListAccount(sql);
        for (Account Account : b) {
            if(Account.id == id) check = true;
        }
        return check;
    }
    public void AddAccount_DAL(Account b){
        String sql = "Insert into Account(idAccount,Username,displayName,"
                + "Password,idTypeAccount) values (?,?,?,?,?)";
        DB_Helper.getInstance().AddAccount(sql, b);
    }
    public void EditAccount_DAL(Account b){
        String sql = "Update Account set Username = ? , displayName = ? , Password = ? , idTypeAccount = ? where idAccount = ? ";
        DB_Helper.getInstance().EditAccount(sql, b);
    }
    public void EditAcountStaffByID_DAL(String displayname, int id){
        String sql = "Update Account set displayName = '" + displayname + "' where idAccount = " + id;
        DB_Helper.getInstance().ExcuteNew(sql);
    }
    
    public void EditAcountByID_DAL(String displayname, String username, String password, int id){
        String sql = "Update Account set displayName = '" + displayname + "', Username = '" + username + "', Password = '" + password + "' where idAccount = " + id;
        DB_Helper.getInstance().ExcuteEditAccount(sql);
    }
    
    public void ResetPassByID_DAL(String id){
        String sql = "Update Account set Password = N'1' where idAccount = " + id;
        DB_Helper.getInstance().ExcuteResetPass(sql);
    }
    
    public void AddLoginHistory(String username, int type){
        String sql = "Insert into HistoryLogin(username, Type ) values ('" + username + "'," + type + ")";
        DB_Helper.getInstance().ExcuteNew(sql);
    }
}