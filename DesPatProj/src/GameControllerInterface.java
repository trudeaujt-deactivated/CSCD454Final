
public interface GameControllerInterface {

	void start();

	void setWindowText(String string);

	void postWindowText(String string);

	Room getNextRoom(Direction north);

	void setCurrentRoom(Room nextRoom);
	
}
