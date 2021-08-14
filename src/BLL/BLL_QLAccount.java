/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_QLAccount;
import DAL.DAL_QLCustomer;
import DTO.Account;
import DTO.LoginHistory;
import DTO.ViewAccount;
import DTO.ViewLoginHistory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author dophu
 */
public class BLL_QLAccount {
    
    private static BLL_QLAccount _INSTANCE;
    private BLL_QLAccount() {
        
    }
    public static BLL_QLAccount getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new BLL_QLAccount();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Account> GetListAccount_BLL(){
        return DAL_QLAccount.getInstance().GetListAccount_DAL();
    }
    
    public ArrayList<LoginHistory> GetListLoginHistory_BLL(){
        return DAL_QLAccount.getInstance().GetListLoginHistory_DAL();
    }
    
    public void DeleteAccount_BLL(String id){
        DAL_QLAccount.getInstance().DeleteAccount_DAL(id);
    }
    
     public void DeleteAdminAccount_BLL(String id){
        DAL_QLAccount.getInstance().DeleteAdminAccount_DAL(id);
    }
    
    public void UpdateAccountStaff_BLL(String displayname, int id){
        DAL_QLAccount.getInstance().EditAcountStaffByID_DAL(displayname, id);
    }
    
    public ArrayList<Account> GetListAccount_BLL(String name){
        return DAL_QLAccount.getInstance().GetListAccount_DAL(name);
    }
    
    public void UpdateAccount_BLL(String displayname, String username, String password, int id){
        DAL_QLAccount.getInstance().EditAcountByID_DAL(displayname, username, password, id);
    }
    
    public void AddAccount_BLL(Account c){
        DAL_QLAccount.getInstance().AddAccount_DAL(c);
    }
    
    public void EditAccount_BLL(Account c){
        DAL_QLAccount.getInstance().EditAccount_DAL(c);
    }
    
    public void ResetPasswordAccount_BLL(String id){
        DAL_QLAccount.getInstance().ResetPassByID_DAL(id);
    }
    
    public void AddHistoryLogin_BLL(String username, int type){
        DAL_QLAccount.getInstance().AddLoginHistory(username, type);
    }
    
    //public void ExcuteAccount_BLL(Account b){
        //boolean check = false;
        //if(DAL_QLAccount.getInstance().CheckAccount_DAL(b.id)){
            //check = true;
        //}
        //if(!check){
            //DAL_QLAccount.getInstance().AddAccount_DAL(b);
        //}
        //else DAL_QLAccount.getInstance().EditAccount_DAL(b);
    //}
    public Account GetAccountByID(int id){
        Account b = new Account();
        for (Account Account : GetListAccount_BLL()) {
            if(Account.id == id){
                b = Account;
            }
        }
        return b;
    }
    
    public boolean CheckAccountByUsername(String username){
        boolean check = false;
        for (Account Account : GetListAccount_BLL()) {
            if(Account.username.equals(username))
                check = true;
        }
        return check;
    }
    
    public ViewAccount GetViewAccountByAccount(Account b){

        return new ViewAccount(b.id,b.username, b.displayname, b.password, b.type);
    }
    
    public ViewLoginHistory GetViewLoginHistoryByAccount(LoginHistory b){

        return new ViewLoginHistory(b.id, b.username, b.type, b.date);
    }
    
    public ArrayList<ViewAccount> GetListViewAccount(){
        ArrayList<ViewAccount> al = new ArrayList<ViewAccount>();
        for (Account b : GetListAccount_BLL()) {
            al.add(GetViewAccountByAccount(b));
        }
        return al;
    }
    
    public ArrayList<ViewLoginHistory> GetListViewLoginHistory(){
        ArrayList<ViewLoginHistory> al = new ArrayList<ViewLoginHistory>();
        for (LoginHistory b : GetListLoginHistory_BLL()) {
            al.add(GetViewLoginHistoryByAccount(b));
        }
        return al;
    }
    
    public ArrayList<ViewAccount> GetListViewAccount(String name){
        ArrayList<ViewAccount> al = new ArrayList<ViewAccount>();
        for (Account b : GetListAccount_BLL(name)) {
            al.add(GetViewAccountByAccount(b));
        }
        return al;
    }
    
}