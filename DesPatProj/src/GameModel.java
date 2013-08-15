import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * Model portion of the model-view-controller.
 */
public class GameModel implements GameModelInterface {

	/** the file to read maps and actor info from */
	private static final String GAMEFILE = "DungeonRoom.txt";
	private static final int NUMPLAYERS = 5;
	
	private GameControllerInterface controller;
	
	private Dungeon dungeon;
	private PartyComponent playerParty;
	private Room currentRoom;
	
	public GameModel() {
		
		dungeon = new Dungeon(GAMEFILE);
		currentRoom = dungeon.getEntryRoom();
		partySetup();
	}
	public void partySetup(){
		int i = NUMPLAYERS;
		Character character;
		
		CharacterRequest testCharacter = new CharacterSpawn();
 		playerParty = new Party("Good Guys", new ArrayList<PartyComponent>());
 		
 		playerParty.add(new PartyMember(testCharacter.generate("hero", "tough")));
 		while( i-- > 0 ){
 			character = testCharacter.generate("random","tough");
 			playerParty.add(new PartyMember(character));
 		}
		
	}
	public void setController(GameControllerInterface gci) {
		controller = gci;
		
	}
	
	public String getPlayerList(){
		
		int i = 0;
		StringBuilder ret = new StringBuilder();
		
		CompositeIterator iterator = 
				(CompositeIterator)playerParty.createIterator();
		while(iterator.hasNext()){
			ret.append("Character " + i++ + " " + iterator.next().getName() + "\n");
		}
		return ret.toString();
		
		
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
    
    public Room getCurrentRoom() {
    	
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
