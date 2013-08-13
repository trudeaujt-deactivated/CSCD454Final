
public class CommandMoveWest extends Command2 
{
	private Game game;
	
	public CommandMoveWest(Game game)
	{
		commandString = "move west";
		this.game = game;
	}
	@Override
	public void execute() {
		game.setWindowText("Moving West if I can");
		game.setWindowText("Method does not work! Modify CommandMoveWest.execute()");

		// TODO Auto-generated method stub

	}

}
