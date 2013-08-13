
public class CommandMoveSouth extends Command2 
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
		game.setWindowText("Moving South if I can");
		game.setWindowText("Method does not work! Modify CommandMoveSouth.execute()");

		/*Your same code here*/
	}

}
