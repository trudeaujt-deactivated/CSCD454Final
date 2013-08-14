
public interface GameModelInterface {

	void add(int index_x, int index_y, TileActor newTile);
	
	void remove(int index_x, int index_y);
	
	String getDungeonDescription();
	
	String toString();

	Room getNextRoom(Direction dir);

	void setCurrentRoom(Room room);

}
