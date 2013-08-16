
public class CommandAttack extends Command
{
	public CommandAttack(GameControllerInterface gci)
	{
		this.controller = (GameController)gci;
		commandString = "attack";
	}

	
	@Override
	public void execute() 
	{
		controller.attack();
		
	}
	
		
	}
	



