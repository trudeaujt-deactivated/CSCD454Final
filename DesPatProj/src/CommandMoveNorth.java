
public class CommandMoveNorth extends Command 
{
	
	public CommandMoveNorth(GameControllerInterface gci)
	{
		commandString = "move north";
		controller = gci;
	}
	@Override
	public void execute() 
	{
		controller.setCurrentRoom(controller.getNextRoom(Direction.NORTH));
		controller.postWindowText("Executed Move North");
	}

}
