/**
 * Controller portion of the model-view-controller
 */
public class GameController implements GameControllerInterface {

	GameModelInterface gameModel;
	MainWin gameView;
	
	public GameController(GameModelInterface model) {
		
		gameModel = model;
		gameView = new MainWin();
		start();

	}
	
	public void start() {
		
		setWindowText(gameModel.getDungeonDescription());
		gameView.setVisible(true);
		
	}
	
	public void addInventory() {
		
		//lots of stubs, each will call appropriate method from gameModel which will handle the heavy lifting
		//feel free to change return types and variables passed in...
		
	}
	
	public void attack() {
		
		
		
	}
	
	public void attackBehavior() {
		
		
		
	}
	
	public void changeWeapon() {
		
		
		
	}
	
	public void defenseBehavior() {
		
		
		
	}
	
	public void flee() {
		
		
		
	}
	
	public void fleeBehavior() {
		
		
		
	}
	
	public void giveItem() {
		
		
		
	}
	
	public void join() {
		
		
		
	}
	
	public void moveEast() {
		
		
		
	}
	
	public void moveNorth() {
		
		
		
	}
	
	public void moveSouth() {
		
		
		
	}
	
	public void moveWest() {
		
		
		
	}
	
	public void search() {
		
		
		
	}
	
	public Room getNextRoom(Direction dir){

		return gameModel.getNextRoom(dir);
		
	}
	
	public void setCurrentRoom(Room room){
		
		gameModel.setCurrentRoom(room);
		
	}
	
	public void setWindowText(String string) {
		
		//not sure which method we are using?
		
	}
	
	public void postWindowText(String str){
		//can't get this right...diverting for now
		//window.postOutput(str);
		setWindowText(str);
	}
	
	/**
	 * For testing purposes only!
	 */
	public static void main(final String[] arguments) {
		
		GameModelInterface newGameModel = new GameModel();
		GameController gameController = new GameController(newGameModel);
		
	}
	
}
