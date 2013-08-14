
public class CommandMoveEast extends Command 
{
	
	public CommandMoveEast(GameControllerInterface gci)
	{
		commandString = "move east";
		controller = gci;
	}
	
	@Override
	public void execute() 
	{
		controller.setCurrentRoom(controller.getNextRoom(Direction.EAST));
		controller.postWindowText("Executed Move East");

	}

}
