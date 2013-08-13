
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
		game.setWindowText("Moving North if I can");
		game.setWindowText("Method does not work! Modify CommandMoveNorth.execute()");

		/*Your same code here*/
	}

}
