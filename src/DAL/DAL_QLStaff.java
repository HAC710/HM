
package DAL;

import DTO.Staff;
import DTO.Account;
import DTO.LoginHistory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author dophu
 */
public class DAL_QLStaff {
    private static DAL_QLStaff _INSTANCE;
    private DAL_QLStaff() {
        
    }
     public static DAL_QLStaff getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new DAL_QLStaff();
        }
        return _INSTANCE;
    }
     
    public ArrayList<Staff> GetListStaff_DAL(){
        String sql = "Select * from Staff";
        return DB_Helper.getInstance().GetListStaff(sql);
    }
    public void DeleteStaff_DAL(String id){
        String sql = "Delete from Staff where idStaff="+id;
        DB_Helper.getInstance().ExcuteDB(sql);
    }
    public ArrayList<Staff> GetListStaff_DAL(String name) {
        ArrayList<Staff> ar = new ArrayList<Staff>();
        try {
            switch(name){
            case "": ar = getInstance().GetListStaff_DAL(); break;
            default: {
                String sql = "Select * from Staff where nameStaff like '%" + name + "%'";
                ar = DB_Helper.getInstance().GetListStaff(sql);
                break;
            }
        }
        } catch (Exception e) {
            ar = null;
        }
        return ar;
    }
    
    public boolean CheckStaff_DAL(int id){
        boolean check = false;
        String sql = "Select * from Staff";
        ArrayList<Staff> d = DB_Helper.getInstance().GetListStaff(sql);
        for (Staff Staff : d) {
            if(Staff.id == id) check = true;
        }
        return check;
    }
    
    public boolean CheckAccount_DAL(String username){
        boolean check = false;
        String sql = "SELECT * FROM HistoryLogin WHERE ID = (SELECT MAX(ID) FROM HistoryLogin)";
        ArrayList<LoginHistory> d = DB_Helper.getInstance().GetListLoginHistory(sql);
        for (LoginHistory LoginHistory : d) {
            if(LoginHistory.username.equals(username)) check = true;
        }
        return check;
    }
    
    public void AddStaff_DAL(Staff d){     
        String sql = "Insert into Staff(idStaff,nameStaff,ageStaff,"
                + "gender,phoneNumber,addressStaff,idPosstion) values (?,?,?,?,?,?,?)";
        DB_Helper.getInstance().AddStaff(sql, d);
    }
    public void EditStaff_DAL(Staff d){
        String sql = "Update Staff set nameStaff = ? , ageStaff = ? , gender = ? , phoneNumber = ? , "
                + "addressStaff = ?, idPosstion = ? where idStaff = ? ";
        DB_Helper.getInstance().EditStaff(sql, d);
    }
}
