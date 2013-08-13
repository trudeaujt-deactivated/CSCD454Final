
public class CommandMoveEast extends Command2 
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
		game.setWindowText("Moving east if I can");
		game.setWindowText("Method does not work! Modify CommandMoveEast.execute()");

		/*Your code here*/
	}

}
