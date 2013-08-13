import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * A basic two-dimensional map. 
 * Starting coordinate (0,0) is in the top-left corner. 
 * Due to this, field grid is accessed with grid[coordinate y][coordinate x].
 */
public class Room {

	/** the default number of columns */
	private static final int DEFAULT_SIZE_X = 30;

	/** the default number of rows */
	private static final int DEFAULT_SIZE_Y = 15;

	/** the number of columns */
	private final int size_x;

	/** the number of rows */
	private final int size_y;

	private String name;
	private String description;
	private HashMap<Direction, Room>connectingRooms;
	private Tile[][] grid;
	private char[][] displayedGrid;

	private List<Tile> actorList = new ArrayList<Tile>();
	private List<Tile> itemList = new ArrayList<Tile>();


	public Room() {

		size_x = DEFAULT_SIZE_X;
		size_y = DEFAULT_SIZE_Y;

		name = "Default Room";
		description = "";
		grid = new Tile[size_y][size_x];
		displayedGrid = new char[size_y][size_x];
		connectingRooms = new HashMap<Direction, Room>();
		initializeGrid();

	}

	public Room(int x, int y, String name) {

		size_x = x;
		size_y = y;

		this.name = name;
		description = "";
		connectingRooms = new HashMap<Direction, Room>();
		grid = new Tile[size_y][size_x];
		displayedGrid = new char[size_y][size_x];

		initializeGrid();

	}

	public void add(int index_x, int index_y, TileActor newTile) {

		if (checkInBounds(index_x, index_y)) {

			newTile.setCoordinates(index_x, index_y);
			actorList.add(newTile);

		}

		else throw new IndexOutOfBoundsException();

	}
	
	public void addItem(int index_x, int index_y, TileActor newTile) {
		
		if(checkInBounds(index_x, index_y)) {
			
			newTile.setCoordinates(index_x, index_y);
			itemList.add(newTile);
			
		}
		
		else throw new IndexOutOfBoundsException();
		
	}

	public void remove(int index_x, int index_y) {

		// a copy is needed, because an object can not be iterated over and modified at the same time
		ArrayList<Tile> actorListCopy = new ArrayList<Tile>(actorList);

		if (checkInBounds(index_x, index_y)) {

			for(Tile t: actorListCopy)
				if(t.getCoordinateX() == index_x && t.getCoordinateY() == index_y)
					actorList.remove(t);

		}

		else throw new IndexOutOfBoundsException();

	}
	
	public void removeItem(TileActor theTile) {

		// a copy is needed, because an object can not be iterated over and modified at the same time
		ArrayList<Tile> itemListCopy = new ArrayList<Tile>(itemList);

		for(Tile t: itemListCopy)
			if(t.equals(theTile))
				itemList.remove(t);

		else throw new IndexOutOfBoundsException();

	}

	private boolean checkInBounds(int index_x, int index_y) {

		if ((index_x > size_x) || (index_x < 0) || (index_y > size_y) || (index_y < 0))
			return false;

		return true;

	}

	private void initializeGrid() {

		int row, col;

		for (row = 0; row < size_y; row++)
			for (col = 0; col < size_x; col++)
				grid[row][col] = new TileGround();

	}

	/**
	 * This will draw the actors onto the base grid according to their locations, updating the displayed grid instead of
	 * the base grid to ensure tiles (such as grass, ground, etc) are not overwritten in the base grid.
	 */
	private void updateDisplay() {

		int row, col;

		for (row = 0; row < size_y; row++)
			for (col = 0; col < size_x; col++)
				displayedGrid[row][col] = grid[row][col].display();

		for (Tile t: actorList)
			displayedGrid[t.getCoordinateY()][t.getCoordinateX()] = t.display();

	}

	public String toString() {

		updateDisplay();

		StringBuilder string = new StringBuilder();

		for(char[] row: displayedGrid) {

			for(char c: row)
				string.append(c);

			string.append("\n");

		}

		return string.toString();

	}
	
	public String displayCharacters() {
		
		StringBuilder string = new StringBuilder();
		
		string.append("Characters in " + name + ":\n");
		
		for(Tile t: actorList)
			string.append(t.toString() + "\n");
		
		return string.toString();
		
	}
	
	public String displayItems() {
		
		StringBuilder string = new StringBuilder();
		
		string.append("Items in " + name + ":\n");
		
		for(Tile t: itemList)
			string.append(t.toString() + "\n");
		
		return string.toString();
		
	}

	public String getName() {

		return name;

	}
	public void setDescription(String desc){
		description = desc;
	}

	public String getDescription(){
		return description;
	}

	public void addConnectingRoom(Room toAdd, Direction d){

		assert(connectingRooms.containsKey(d) == false);
		connectingRooms.put(d, toAdd);
	}

	public boolean checkConnectingRoom(Direction d){
		return connectingRooms.containsKey(d);
	}

	public void setConnectingRooms(HashMap<Direction, Room> map){
		connectingRooms = map;
	}
	
	public Room getConnectingRoom(Direction d){
		if(connectingRooms.containsKey(d))
			return connectingRooms.get(d);
		
		return this;
	}
}
