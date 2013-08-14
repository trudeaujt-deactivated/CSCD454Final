
public class CommandMoveWest extends Command 
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
		game.postWindowText("Executed Move West");

	}

}
