/**
 * Model portion of the model-view-controller.
 */
public class GameModel implements GameModelInterface {

	/** the file to read maps and actor info from */
	private static final String GAMEFILE = "TestRoom.txt";
	
	private Dungeon dungeon;
	
	public GameModel() {
		
		dungeon = new Dungeon(GAMEFILE);
		
	}
	
    public void add(int index_x, int index_y, TileActor newTile) {
        
        dungeon.add(index_x, index_y, newTile);
        
    }
    
    public void remove(int index_x, int index_y) {

        dungeon.remove(index_x, index_y);
        
    }

	public String getDungeonDescription() {
		
		return dungeon.getCurrentRoom().getDescription();
		
	}
	
	public String toString() {
		
		return dungeon.toString();
		
	}
	
}
