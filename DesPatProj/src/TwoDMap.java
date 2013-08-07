import java.util.ArrayList;

/**
 * Facade for the Room class, allows the displayed room to be swapped.
 * 
 * @author Jonathan Trudeau
 */
public class TwoDMap {
    
    private ArrayList<Room> roomList = new ArrayList<Room>();
    private Room currentRoom;
    
    public TwoDMap() {

        currentRoom = new Room();
        
    }
    
    public TwoDMap(int x, int y, String name) {
        
        currentRoom = new Room(x, y, name);
        
    }
    
    public void changeRoom(String name) {
        
        for(Room r: roomList)
            if(r.getName().equals(name))
                currentRoom = r;
        
    }
    
    public void add(int index_x, int index_y, TileActor newTile) {
        
        currentRoom.add(index_x, index_y, newTile);
        
    }
    
    public void remove(int index_x, int index_y) {

        currentRoom.remove(index_x, index_y);
        
    }
    
    public String toString() {
        
        return currentRoom.toString();
        
    }
    
    public void display() {
        
        System.out.println(currentRoom.toString());
            
    }
    
}
