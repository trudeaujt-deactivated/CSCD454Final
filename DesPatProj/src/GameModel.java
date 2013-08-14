/**
 * Model portion of the model-view-controller.
 */
public class GameModel implements GameModelInterface {

	/** the file to read maps and actor info from */
	private static final String GAMEFILE = "TestRoom.txt";
	
	private GameControllerInterface controller;
	
	private Dungeon dungeon;
	private PartyComponent playerParty;
	private Room currentRoom;
	
	public GameModel() {
		
		dungeon = new Dungeon(GAMEFILE);
		
	}
	
	public void setController(GameControllerInterface gci) {
		
		controller = gci;
		
	}

	//add / remove actors to current room by coordinates
    public void add(int index_x, int index_y, TileActor newTile) {
        
        currentRoom.add(index_x, index_y, newTile);
        
    }
    
    public void remove(int index_x, int index_y) {

        currentRoom.remove(index_x, index_y);
        
    }
    
    public Room getNextRoom(Direction dir) {
    	
		Room room = currentRoom.getConnectingRoom(dir);
		if (room == currentRoom)
			controller.postWindowText("There is no way to go " + dir.toString());
		
		return room;
    	
    }
    
    public Room getCurrentRoom(Room room) {
    	
    	return currentRoom;
    	
    }
    
	public void setCurrentRoom(Room room){
		
		//assert currentRoom != null...
		currentRoom = room;
		
	}

	public String getDungeonDescription() {
		
		return currentRoom.getDescription();
		
	}
	
	public String toString() {
		
		return dungeon.toString();
		
	}
	
}
