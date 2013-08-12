import java.util.ArrayList;
import java.util.Scanner;


public class Game {
	
	private static final String 	GAMEFILE = "TestRoom.txt";
	
	private Dungeon dungeon;
	private MainWin window;
	
	
	public Game(){
		dungeon = null;
		window = null;
	}
	
	public Game(Dungeon dungeon){
		this.dungeon = dungeon;
		window = new MainWin();
	}
	
	public void begin(){
		
		setWindowText(dungeon.getEntryRoom().getDescription());
		window.setVisible(true);
	}

	public String toString(){
		return "";
	}
	
	public void setWindowText(String str){
		window.setOutput(str);
	}
	
	public static void main(String[] args){
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		
		for(int i = 0; i < 5; i++){
			rooms.add(new Room());
		}
		Dungeon dungeon = new Dungeon(GAMEFILE);
		Game game = new Game(dungeon);
		game.begin();
	}
	
	
	

}
