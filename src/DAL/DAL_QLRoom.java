
package DAL;

import DTO.Customer;
import DTO.Room;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAL_QLRoom {
    
    private static DAL_QLRoom _INSTANCE;
    private DAL_QLRoom() {
        
    }
     public static DAL_QLRoom getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new DAL_QLRoom();
        }
        return _INSTANCE;
    }
     
     public ArrayList<Room> GetListRoom_DAL(){
        String sql = "Select * from Room";
        return DB_Helper.getInstance().GetListRoom(sql);
    }
     
     public void AddRoom_DAL(Room c){
        String sql = "Insert into Room(idRoom,idTypeRoom) values (?,?)";
        DB_Helper.getInstance().AddRoom(sql, c);
    }
     
     public void EditRoom_DAL(Room c){
        String sql = "Update Room set idTypeRoom = ? where idRoom = ? ";
        DB_Helper.getInstance().EditRoom(sql, c);
    }
     
     public boolean CheckRoom_DAL(int id){
        boolean check = false;
        String sql = "Select * from Room";
        ArrayList<Room> c = DB_Helper.getInstance().GetListRoom(sql);
        for (Room room : c) {
            if(room.id == id) check = true;
        }
        return check;
    }
     
     public void DeleteRoom_DAL(String id){
        String sql = "Delete from Room where idRoom="+id;
        DB_Helper.getInstance().ExcuteDB(sql);
    }
     
     public ArrayList<Room> GetListRoom_DAL(String s) {
        ArrayList<Room> ar = new ArrayList<Room>();
        try {
            if(s.equals("")){
                ar = getInstance().GetListRoom_DAL();
            }
            else{
                try {
                    int id = Integer.parseInt(s);
                    String sql = "Select * from Room where idRoom = " + id;
                    ar = DB_Helper.getInstance().GetListRoom(sql);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "please enter a valid ID!!!");
                }
            }
        } catch (Exception e) {
            ar = null;
        }
        return ar;
    }
}
