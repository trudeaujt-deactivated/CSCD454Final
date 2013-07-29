/**
 * Wrapper for the Room class, allows the displayed room to be swapped.
 * 
 * @author Jonathan Trudeau
 */
public class TwoDMap {
    
    private Room room;
    
    public TwoDMap() {

        room = new Room();
        
    }
    
    public TwoDMap(int x, int y) {
        
        room = new Room(x, y);
        
    }
    
    public void add(int index_x, int index_y, Tile newTile) {
        
        room.add(index_x, index_y, newTile);
        
    }
    
    public void remove(int index_x, int index_y) {

        room.remove(index_x, index_y);
        
    }
    
    public String toString() {
        
        return room.toString();
        
    }
    
    public void display() {
        
        System.out.println(room.toString());
            
    }
    
}
