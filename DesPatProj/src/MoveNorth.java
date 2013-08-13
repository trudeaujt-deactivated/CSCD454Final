
public class MoveNorth extends Command2 {
	public MoveNorth(Game game){
		this.game = game;
		commandString = "move north";
	}
	@Override
	public void execute() {
		game.setWindowText("Moving North if I can");
		/*Your same code here*/
	}

}
