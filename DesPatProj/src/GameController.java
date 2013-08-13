/**
 * Controller portion of the model-view-controller
 */
public class GameController {

	GameModelInterface gameModel;
	MainWin gameView;
	
	public GameController(GameModelInterface model) {
		
		gameModel = model;
		gameView = new MainWin();
		start();

	}
	
	public void start() {
		
		gameView.setWindowText(gameModel.getDungeonDescription());
		gameView.setVisible(true);
		
	}
	
	/**
	 * For testing purposes only!
	 */
	public static void main(final String[] arguments) {
		
		GameModelInterface newGameModel = new GameModel();
		GameController gameController = new GameController(newGameModel);
		
	}
	
}
