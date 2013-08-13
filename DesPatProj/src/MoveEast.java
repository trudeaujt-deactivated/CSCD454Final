
public class MoveEast extends Command2 {
	public MoveEast(Game game){
		this.game = game;
		commandString = "move east";
	}
	@Override
	public void execute() {
		game.setWindowText("Moving east if I can");
		/*Your code here*/
	}

}
