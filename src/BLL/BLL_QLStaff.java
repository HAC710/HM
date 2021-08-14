
package BLL;

import DAL.DAL_QLStaff;
import DTO.Staff;
import DTO.Account;
import DTO.ViewStaff;
import GUI.Manage.ExcuteAccountJPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author dophu
 */
public class BLL_QLStaff {
    private static BLL_QLStaff _INSTANCE;
    private BLL_QLStaff() {
        
    }
     public static BLL_QLStaff getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new BLL_QLStaff();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Staff> GetListStaff_BLL(){
        return DAL_QLStaff.getInstance().GetListStaff_DAL();
    }
    public void DeleteStaff_BLL(String id){
        DAL_QLStaff.getInstance().DeleteStaff_DAL(id);
    }
    public ArrayList<Staff> GetListStaff_BLL(String name){
        return DAL_QLStaff.getInstance().GetListStaff_DAL(name);
    }
    
    public boolean CheckStaffByID(Staff c){
        return DAL_QLStaff.getInstance().CheckStaff_DAL(c.id);
    }
    
    public boolean CheckAccountByUserName(String username){
        return DAL_QLStaff.getInstance().CheckAccount_DAL(username);
    }
    
    public void AddStaff_BLL(Staff c){
        DAL_QLStaff.getInstance().AddStaff_DAL(c);
    }
    
    public void EditStaff_BLL(Staff c){
        DAL_QLStaff.getInstance().EditStaff_DAL(c);
    }
    
    //public void ExcuteStaff_BLL(Staff c){
        //boolean check = false;
        //if(DAL_QLStaff.getInstance().CheckStaff_DAL(c.id)){
            //check = true;
        //}
        //if(!check){
                //DAL_QLStaff.getInstance().AddStaff_DAL(c); 
        //}
        //else DAL_QLStaff.getInstance().EditStaff_DAL(c);
    //}
    public Staff GetStaffByID(int id){
        Staff d = new Staff();
        for (Staff Staff : GetListStaff_BLL()) {
            if(Staff.id == id){
                d = Staff;
            }
        }
        return d;
    }
    
    public ViewStaff GetViewStaffByStaff(Staff d){
        String gender;
        if(d.gender) gender = "Male";
        else gender = "Female";
        
       
        return new ViewStaff(d.id,d.name, d.age, d.adress, d.phone, d.posstion, gender);
    }
    
    public ArrayList<ViewStaff> GetListViewStaff(){
        ArrayList<ViewStaff> al = new ArrayList<ViewStaff>();
        for (Staff d : GetListStaff_BLL()) {
            al.add(GetViewStaffByStaff(d));
        }
        return al;
    }
    public ArrayList<ViewStaff> GetListViewStaff(String name){
        ArrayList<ViewStaff> al = new ArrayList<ViewStaff>();
        for (Staff d : GetListStaff_BLL(name)) {
            al.add(GetViewStaffByStaff(d));
        }
        return al;
    }
    
}
