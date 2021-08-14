
package BLL;

import DAL.DAL_QLRoom;
import DTO.Room;
import DTO.ViewRoom;
import java.util.ArrayList;

public class BLL_QLRoom {
    
    private static BLL_QLRoom _INSTANCE;
    private BLL_QLRoom() {
        
    }
     public static BLL_QLRoom getInstance(){
        if(_INSTANCE == null){
            _INSTANCE = new BLL_QLRoom();
        }
        return _INSTANCE;
    }
     
     public ArrayList<Room> GetListRoom_BLL(){
        return DAL_QLRoom.getInstance().GetListRoom_DAL();
    }
     
     public ViewRoom GetViewRoomByRoom(Room c){
        String type;
        if(c.type) type = "Normal";
        else type = "Vip";
        return new ViewRoom(c.id, type);
    }
     
     public ArrayList<ViewRoom> GetListViewRoom(){
        ArrayList<ViewRoom> al = new ArrayList<ViewRoom>();
        for (Room c : GetListRoom_BLL()) {
            al.add(GetViewRoomByRoom(c));
        }
        return al;
    }
    public ArrayList<ViewRoom> GetListViewRoomUncheck(){
        ArrayList<ViewRoom> al = new ArrayList<ViewRoom>();
        for (Room c : GetListRoom_BLL()) {
            al.add(GetViewRoomByRoom(c));
        }
        return al;
    } 
     public void ExcuteRoom_BLL(Room c){
        boolean check = false;
        if(DAL_QLRoom.getInstance().CheckRoom_DAL(c.id)){
            check = true;
        }
        if(!check){
            DAL_QLRoom.getInstance().AddRoom_DAL(c);
        }
        else DAL_QLRoom.getInstance().EditRoom_DAL(c);
    }
     
     public Room GetRoomByID(int id){
        Room c = new Room();
        for (Room room : GetListRoom_BLL()) {
            if(room.id == id){
                c = room;
            }
        }
        return c;
    }
     
     public void DeleteRoom_BLL(String id){
        DAL_QLRoom.getInstance().DeleteRoom_DAL(id);
    }
     public ArrayList<Room> GetListRoom_BLL(String s){
        return DAL_QLRoom.getInstance().GetListRoom_DAL(s);
    }
     public ArrayList<ViewRoom> GetListViewRoom(String s){
        ArrayList<ViewRoom> al = new ArrayList<ViewRoom>();
        for (Room c : GetListRoom_BLL(s)) {
            al.add(GetViewRoomByRoom(c));
        }
        return al;
    }
}
