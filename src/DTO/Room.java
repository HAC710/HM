
package DTO;


public class Room {
    
    public int id;
    public boolean type;
    
    public Room() {}

    public Room(int id, boolean type) {
        this.id = id;
        this.type = type;
    }
    
    public static boolean Compare_ID(Room a, Room b ){
        return a.id > b.id;
    }
    
    public static boolean Compare_Type(Room a, Room b ){
        return true;
    }
}
