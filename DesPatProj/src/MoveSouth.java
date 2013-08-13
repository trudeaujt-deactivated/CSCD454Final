
public class MoveSouth extends Command2 {
	public MoveSouth(Game game){
		
		this.game = game;
		commandString = "move south";
	}
	@Override
	public void execute() {
		game.setWindowText("Moving South if I can");
		/*Your same code here*/
	}

}
