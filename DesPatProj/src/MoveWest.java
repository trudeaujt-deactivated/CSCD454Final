
public class MoveWest extends Command2 {

	public MoveWest(Game game){
		this.game = game;
		commandString = "move west";
	}
	@Override
	public void execute() {
		game.setWindowText("Moving West if I can");
		// TODO Auto-generated method stub

	}

}
