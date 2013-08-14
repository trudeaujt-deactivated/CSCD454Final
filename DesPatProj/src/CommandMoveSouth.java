
public class CommandMoveSouth extends Command 
{
	private Game game;
	
	public CommandMoveSouth(Game game)
	{
		commandString = "move south";
		this.game = game;
	}
	@Override
	public void execute() 
	{
		game.setCurrentRoom(game.getNextRoom(Direction.SOUTH));
		game.postWindowText("Executed Move South");
	}

}
