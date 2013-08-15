
public class CommandMoveWest extends Command 
{
	
	public CommandMoveWest(GameControllerInterface gci)
	{
		commandString = "move west";
		controller = (GameController)gci;
	}
	@Override
	public void execute() {
		controller.setCurrentRoom(controller.getNextRoom(Direction.WEST));
		controller.postWindowText("Executed Move West");

	}

}
