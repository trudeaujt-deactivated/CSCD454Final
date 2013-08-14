
public class CommandMoveEast extends Command 
{
	private Game game;
	
	public CommandMoveEast(Game game)
	{
		commandString = "move east";
		this.game = game;
	}
	
	@Override
	public void execute() 
	{
		game.setCurrentRoom(game.getNextRoom(Direction.EAST));
		game.postWindowText("Executed Move East");

	}

}
