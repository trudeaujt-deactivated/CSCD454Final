
public abstract class GameControllerInterface {

	abstract void start();

	abstract void setWindowText(String string);

	abstract void postWindowText(String string);

	abstract Room getNextRoom(Direction north);

	abstract void setCurrentRoom(Room nextRoom);

	abstract void updateMap(String string);

	public void attack() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
