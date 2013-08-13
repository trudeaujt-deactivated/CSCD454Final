
public class CommandMoveNorth extends Command2 
{
	private Game game;
	
	public CommandMoveNorth(Game game)
	{
		commandString = "move north";
		this.game = game;
	}
	@Override
	public void execute() 
	{
		game.setCurrentRoom(game.getNextRoom(Direction.NORTH));
		game.postWindowText("Executed Move North");
	}

}
