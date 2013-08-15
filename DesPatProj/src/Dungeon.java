import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Dungeon {
	
	ArrayList<Room> rooms;
	Room entryRoom;
	Room exitRoom;

	public Dungeon(){
		rooms = new ArrayList<Room>();
		entryRoom = null;
		exitRoom = null;
	}
	
	public Dungeon(ArrayList<Room> rooms){
		this.rooms = rooms;
		entryRoom = exitRoom = null;
	}
	
	public Dungeon(String filename){
		rooms = new ArrayList<Room>();
		dungeonFile(filename);
	}

	public void setEntryRoom(Room entry){
		entryRoom = entry;
	}
	
	public void setExitRoom(Room exit){
		exitRoom = exit;
	}
	
	public void addRoom(Room toAdd){
		rooms.add(toAdd);
	}
	

	
	public Room getRoom(String name){
		int index = 0;
		assert((index = findRoom(name)) >= 0);
		return rooms.get(index);
		
	}

	public int findRoom(String name){
		for(Room r:rooms){
			if(r.getName().equalsIgnoreCase(name))
				return rooms.indexOf(r);
		}
		return -1;
	}
	
	public Room getEntryRoom(){
		
		assert(entryRoom != null);
		return entryRoom;
		
	}
	
	public Room getExitRoom(){
		assert(exitRoom != null);
		return exitRoom;
	}
	
	
	public void dungeonFile(String filename){
		int i, numRooms, xSize, ySize;
		String name, desc;

		HashMap<Room, ArrayList<String>> roomMap = 
				new HashMap<Room, ArrayList<String>>();

		HashMap<String, ArrayList<TempRoom>> tempMap = 
				new HashMap<String, ArrayList<TempRoom>>();

		ArrayList<Room> ret = new ArrayList<Room>();
		Scanner scan = Util.readFile(filename);
		numRooms = scan.nextInt();
		scan.nextLine();
		for(i = 0; i < numRooms; i++){
			name = scan.nextLine();
			//System.out.println("name is " + name);
			xSize = scan.nextInt();
			ySize = scan.nextInt();
			Room currentRoom = new Room(xSize, ySize, name);
			desc = readDescription(scan);
			currentRoom.setDescription(desc);
			/*need to read the items and store them somewhere
			 * this call gets through that part of the file*/
			readItems(scan);
			tempMap.put(currentRoom.getName(), connectingRoomList(scan));
			//currentRoom.setConnectingRooms(readRooms(scan));
			//System.out.println("Adding Room:" + currentRoom.getName());
			rooms.add(currentRoom);
		}
		roomSetup(tempMap);
		entryRoom = rooms.get(findRoom(scan.nextLine()));
		exitRoom = rooms.get(findRoom(scan.nextLine()));
		/*
		for(Room r:rooms)
			System.out.println(r.listConnectingRooms());
			*/

	}
	public void roomSetup(HashMap<String, ArrayList<TempRoom>> tempMap){

		String name;
		ArrayList<TempRoom> tempConnectingRooms;

		for(Room r:rooms){
			//get the roomname and direction and use that to fill roomMap
			HashMap<Direction, Room> map = new HashMap<Direction, Room>();
			Direction dir;
			Room room;
			name = r.getName();
			tempConnectingRooms = tempMap.get(name);
			for(TempRoom t:tempConnectingRooms){
				/*System.out.println("looking for " + t.roomName);*/
				map.put(t.dir, rooms.get(findRoom(t.roomName)));
			}	
			r.setConnectingRooms(map);
		}
	}


	private ArrayList<TempRoom> connectingRoomList(Scanner scan){
		ArrayList<TempRoom> rooms = new ArrayList<TempRoom>();
		boolean done = false;
		String check;
		Direction dir;
		while(!done){
			check = scan.nextLine();
			if(check.contains("#") == false){
				dir = findDirection(scan.nextLine());
				rooms.add(new TempRoom(check, dir));
				//System.out.println("Created roomName:" + check + "\ndir:" + dir.toString()+ "\n\n");
			}
			else
				done = true;
		}

		return rooms;
	}
	private class TempRoom{
		private String roomName;
		private Direction dir;

		public TempRoom(String room, Direction dir){
			this.roomName = room;
			this.dir = dir;
		}
		public String getRoomName(){
			return roomName;
		}
		public Direction getDirection(){
			return dir;
		}
		
		
	}
	private String readDescription(Scanner scan){
		StringBuilder str = new StringBuilder();
		String check = "";
		boolean done = false;
		while(!done){
		check = scan.nextLine();
		if(check.contains("#") == false)
			str.append(check);
		else
			done = true;
		}
		return str.toString();
		
	}
	private ArrayList<Item> readItems(Scanner scan){
		ArrayList<Item> item = new ArrayList<Item>();
		String check;
		boolean done = false;
		while(!done){
			check = scan.nextLine();
			if(check.contains("#") == false){
				//item.add(new UserItem(check));
			}
			else
				done = true;
		}			
		return item;
	}
	private Direction findDirection(String str){
		
		if(str.toUpperCase().equals("NORTH"))
			return Direction.NORTH;
		if(str.toUpperCase().equals("SOUTH"))
			return Direction.SOUTH;
		if(str.toUpperCase().equals("EAST"))
			return Direction.EAST;
		if(str.toUpperCase().equals("WEST"))
			return Direction.WEST;
		else
			return null;
		
	}
	
}
