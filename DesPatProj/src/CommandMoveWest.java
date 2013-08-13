
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
		game.setCurrentRoom(game.getNextRoom(Direction.WEST));
		game.setWindowText("Executed Move West");

	}

}
